package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Configuration.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceConfiguration extends Entity implements Parsable {
    /**
     * Instantiates a new DeviceConfiguration and sets the default values.
     */
    public DeviceConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceConfiguration
     */
    @jakarta.annotation.Nonnull
    public static DeviceConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a java.util.List<DeviceConfigurationAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationAssignment> getAssignments() {
        return this.BackingStore.get("assignments");
    }
    /**
     * Gets the createdDateTime property value. DateTime the object was created.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the description property value. Admin provided description of the Device Configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the deviceManagementApplicabilityRuleDeviceMode property value. The device mode applicability rule for this Policy.
     * @return a DeviceManagementApplicabilityRuleDeviceMode
     */
    @jakarta.annotation.Nullable
    public DeviceManagementApplicabilityRuleDeviceMode getDeviceManagementApplicabilityRuleDeviceMode() {
        return this.BackingStore.get("deviceManagementApplicabilityRuleDeviceMode");
    }
    /**
     * Gets the deviceManagementApplicabilityRuleOsEdition property value. The OS edition applicability for this Policy.
     * @return a DeviceManagementApplicabilityRuleOsEdition
     */
    @jakarta.annotation.Nullable
    public DeviceManagementApplicabilityRuleOsEdition getDeviceManagementApplicabilityRuleOsEdition() {
        return this.BackingStore.get("deviceManagementApplicabilityRuleOsEdition");
    }
    /**
     * Gets the deviceManagementApplicabilityRuleOsVersion property value. The OS version applicability rule for this Policy.
     * @return a DeviceManagementApplicabilityRuleOsVersion
     */
    @jakarta.annotation.Nullable
    public DeviceManagementApplicabilityRuleOsVersion getDeviceManagementApplicabilityRuleOsVersion() {
        return this.BackingStore.get("deviceManagementApplicabilityRuleOsVersion");
    }
    /**
     * Gets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @return a java.util.List<SettingStateDeviceSummary>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SettingStateDeviceSummary> getDeviceSettingStateSummaries() {
        return this.BackingStore.get("deviceSettingStateSummaries");
    }
    /**
     * Gets the deviceStatuses property value. Device configuration installation status by device.
     * @return a java.util.List<DeviceConfigurationDeviceStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationDeviceStatus> getDeviceStatuses() {
        return this.BackingStore.get("deviceStatuses");
    }
    /**
     * Gets the deviceStatusOverview property value. Device Configuration devices status overview
     * @return a DeviceConfigurationDeviceOverview
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationDeviceOverview getDeviceStatusOverview() {
        return this.BackingStore.get("deviceStatusOverview");
    }
    /**
     * Gets the displayName property value. Admin provided name of the device configuration.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(DeviceConfigurationAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("deviceManagementApplicabilityRuleDeviceMode", (n) -> { this.setDeviceManagementApplicabilityRuleDeviceMode(n.getObjectValue(DeviceManagementApplicabilityRuleDeviceMode::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementApplicabilityRuleOsEdition", (n) -> { this.setDeviceManagementApplicabilityRuleOsEdition(n.getObjectValue(DeviceManagementApplicabilityRuleOsEdition::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceManagementApplicabilityRuleOsVersion", (n) -> { this.setDeviceManagementApplicabilityRuleOsVersion(n.getObjectValue(DeviceManagementApplicabilityRuleOsVersion::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceSettingStateSummaries", (n) -> { this.setDeviceSettingStateSummaries(n.getCollectionOfObjectValues(SettingStateDeviceSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatuses", (n) -> { this.setDeviceStatuses(n.getCollectionOfObjectValues(DeviceConfigurationDeviceStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceStatusOverview", (n) -> { this.setDeviceStatusOverview(n.getObjectValue(DeviceConfigurationDeviceOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("groupAssignments", (n) -> { this.setGroupAssignments(n.getCollectionOfObjectValues(DeviceConfigurationGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportsScopeTags", (n) -> { this.setSupportsScopeTags(n.getBooleanValue()); });
        deserializerMap.put("userStatuses", (n) -> { this.setUserStatuses(n.getCollectionOfObjectValues(DeviceConfigurationUserStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("userStatusOverview", (n) -> { this.setUserStatusOverview(n.getObjectValue(DeviceConfigurationUserOverview::createFromDiscriminatorValue)); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the groupAssignments property value. The list of group assignments for the device configuration profile.
     * @return a java.util.List<DeviceConfigurationGroupAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationGroupAssignment> getGroupAssignments() {
        return this.BackingStore.get("groupAssignments");
    }
    /**
     * Gets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.BackingStore.get("roleScopeTagIds");
    }
    /**
     * Gets the supportsScopeTags property value. Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportsScopeTags() {
        return this.BackingStore.get("supportsScopeTags");
    }
    /**
     * Gets the userStatuses property value. Device configuration installation status by user.
     * @return a java.util.List<DeviceConfigurationUserStatus>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceConfigurationUserStatus> getUserStatuses() {
        return this.BackingStore.get("userStatuses");
    }
    /**
     * Gets the userStatusOverview property value. Device Configuration users status overview
     * @return a DeviceConfigurationUserOverview
     */
    @jakarta.annotation.Nullable
    public DeviceConfigurationUserOverview getUserStatusOverview() {
        return this.BackingStore.get("userStatusOverview");
    }
    /**
     * Gets the version property value. Version of the device configuration.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.BackingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationAssignment> value) {
        this.BackingStore.set("assignments", value);
    }
    /**
     * Sets the createdDateTime property value. DateTime the object was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the description property value. Admin provided description of the Device Configuration.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the deviceManagementApplicabilityRuleDeviceMode property value. The device mode applicability rule for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleDeviceMode property.
     */
    public void setDeviceManagementApplicabilityRuleDeviceMode(@jakarta.annotation.Nullable final DeviceManagementApplicabilityRuleDeviceMode value) {
        this.BackingStore.set("deviceManagementApplicabilityRuleDeviceMode", value);
    }
    /**
     * Sets the deviceManagementApplicabilityRuleOsEdition property value. The OS edition applicability for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleOsEdition property.
     */
    public void setDeviceManagementApplicabilityRuleOsEdition(@jakarta.annotation.Nullable final DeviceManagementApplicabilityRuleOsEdition value) {
        this.BackingStore.set("deviceManagementApplicabilityRuleOsEdition", value);
    }
    /**
     * Sets the deviceManagementApplicabilityRuleOsVersion property value. The OS version applicability rule for this Policy.
     * @param value Value to set for the deviceManagementApplicabilityRuleOsVersion property.
     */
    public void setDeviceManagementApplicabilityRuleOsVersion(@jakarta.annotation.Nullable final DeviceManagementApplicabilityRuleOsVersion value) {
        this.BackingStore.set("deviceManagementApplicabilityRuleOsVersion", value);
    }
    /**
     * Sets the deviceSettingStateSummaries property value. Device Configuration Setting State Device Summary
     * @param value Value to set for the deviceSettingStateSummaries property.
     */
    public void setDeviceSettingStateSummaries(@jakarta.annotation.Nullable final java.util.List<SettingStateDeviceSummary> value) {
        this.BackingStore.set("deviceSettingStateSummaries", value);
    }
    /**
     * Sets the deviceStatuses property value. Device configuration installation status by device.
     * @param value Value to set for the deviceStatuses property.
     */
    public void setDeviceStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationDeviceStatus> value) {
        this.BackingStore.set("deviceStatuses", value);
    }
    /**
     * Sets the deviceStatusOverview property value. Device Configuration devices status overview
     * @param value Value to set for the deviceStatusOverview property.
     */
    public void setDeviceStatusOverview(@jakarta.annotation.Nullable final DeviceConfigurationDeviceOverview value) {
        this.BackingStore.set("deviceStatusOverview", value);
    }
    /**
     * Sets the displayName property value. Admin provided name of the device configuration.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the groupAssignments property value. The list of group assignments for the device configuration profile.
     * @param value Value to set for the groupAssignments property.
     */
    public void setGroupAssignments(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationGroupAssignment> value) {
        this.BackingStore.set("groupAssignments", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. DateTime the object was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance.
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roleScopeTagIds", value);
    }
    /**
     * Sets the supportsScopeTags property value. Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.
     * @param value Value to set for the supportsScopeTags property.
     */
    public void setSupportsScopeTags(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("supportsScopeTags", value);
    }
    /**
     * Sets the userStatuses property value. Device configuration installation status by user.
     * @param value Value to set for the userStatuses property.
     */
    public void setUserStatuses(@jakarta.annotation.Nullable final java.util.List<DeviceConfigurationUserStatus> value) {
        this.BackingStore.set("userStatuses", value);
    }
    /**
     * Sets the userStatusOverview property value. Device Configuration users status overview
     * @param value Value to set for the userStatusOverview property.
     */
    public void setUserStatusOverview(@jakarta.annotation.Nullable final DeviceConfigurationUserOverview value) {
        this.BackingStore.set("userStatusOverview", value);
    }
    /**
     * Sets the version property value. Version of the device configuration.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("version", value);
    }
}
