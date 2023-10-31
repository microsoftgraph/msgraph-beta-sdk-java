package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * This class contains compliance settings for Windows 10.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Windows10CompliancePolicy extends DeviceCompliancePolicy implements Parsable {
    /**
     * Require active firewall on Windows devices.
     */
    private Boolean activeFirewallRequired;
    /**
     * Require any AntiSpyware solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     */
    private Boolean antiSpywareRequired;
    /**
     * Require any Antivirus solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     */
    private Boolean antivirusRequired;
    /**
     * Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     */
    private Boolean bitLockerEnabled;
    /**
     * Require devices to be reported as healthy by Windows Device Health Attestation.
     */
    private Boolean codeIntegrityEnabled;
    /**
     * Require to consider SCCM Compliance state into consideration for Intune Compliance State.
     */
    private Boolean configurationManagerComplianceRequired;
    /**
     * Require Windows Defender Antimalware on Windows devices.
     */
    private Boolean defenderEnabled;
    /**
     * Require Windows Defender Antimalware minimum version on Windows devices.
     */
    private String defenderVersion;
    /**
     * Not yet documented
     */
    private DeviceCompliancePolicyScript deviceCompliancePolicyScript;
    /**
     * Require that devices have enabled device threat protection.
     */
    private Boolean deviceThreatProtectionEnabled;
    /**
     * Device threat protection levels for the Device Threat Protection API.
     */
    private DeviceThreatProtectionLevel deviceThreatProtectionRequiredSecurityLevel;
    /**
     * Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     */
    private Boolean earlyLaunchAntiMalwareDriverEnabled;
    /**
     * When TRUE, indicates that Firmware protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Firmware protection is not required to be reported as healthy. Devices that support either Dynamic Root of Trust for Measurement (DRTM) or Firmware Attack Surface Reduction (FASR) will report compliant for this setting. Default value is FALSE.
     */
    private Boolean firmwareProtectionEnabled;
    /**
     * When TRUE, indicates that Kernel Direct Memory Access (DMA) protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Kernel DMA Protection is not required to be reported as healthy. Default value is FALSE.
     */
    private Boolean kernelDmaProtectionEnabled;
    /**
     * When TRUE, indicates that Memory Integrity as known as Hypervisor-protected Code Integrity (HVCI) or Hypervisor Enforced Code Integrity protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Memory Integrity Protection is not required to be reported as healthy. Default value is FALSE.
     */
    private Boolean memoryIntegrityEnabled;
    /**
     * Maximum Windows Phone version.
     */
    private String mobileOsMaximumVersion;
    /**
     * Minimum Windows Phone version.
     */
    private String mobileOsMinimumVersion;
    /**
     * Maximum Windows 10 version.
     */
    private String osMaximumVersion;
    /**
     * Minimum Windows 10 version.
     */
    private String osMinimumVersion;
    /**
     * Indicates whether or not to block simple password.
     */
    private Boolean passwordBlockSimple;
    /**
     * The password expiration in days.
     */
    private Integer passwordExpirationDays;
    /**
     * The number of character sets required in the password.
     */
    private Integer passwordMinimumCharacterSetCount;
    /**
     * The minimum password length.
     */
    private Integer passwordMinimumLength;
    /**
     * Minutes of inactivity before a password is required.
     */
    private Integer passwordMinutesOfInactivityBeforeLock;
    /**
     * The number of previous passwords to prevent re-use of.
     */
    private Integer passwordPreviousPasswordBlockCount;
    /**
     * Require a password to unlock Windows device.
     */
    private Boolean passwordRequired;
    /**
     * Require a password to unlock an idle device.
     */
    private Boolean passwordRequiredToUnlockFromIdle;
    /**
     * Possible values of required passwords.
     */
    private RequiredPasswordType passwordRequiredType;
    /**
     * Require devices to be reported as healthy by Windows Device Health Attestation.
     */
    private Boolean requireHealthyDeviceReport;
    /**
     * Require Windows Defender Antimalware Real-Time Protection on Windows devices.
     */
    private Boolean rtpEnabled;
    /**
     * Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     */
    private Boolean secureBootEnabled;
    /**
     * Require Windows Defender Antimalware Signature to be up to date on Windows devices.
     */
    private Boolean signatureOutOfDate;
    /**
     * Require encryption on windows devices.
     */
    private Boolean storageRequireEncryption;
    /**
     * Require Trusted Platform Module(TPM) to be present.
     */
    private Boolean tpmRequired;
    /**
     * The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.
     */
    private java.util.List<OperatingSystemVersionRange> validOperatingSystemBuildRanges;
    /**
     * When TRUE, indicates that Virtualization-based Security is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Virtualization-based Security is not required to be reported as healthy. Default value is FALSE.
     */
    private Boolean virtualizationBasedSecurityEnabled;
    /**
     * Instantiates a new Windows10CompliancePolicy and sets the default values.
     */
    public Windows10CompliancePolicy() {
        super();
        this.setOdataType("#microsoft.graph.windows10CompliancePolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Windows10CompliancePolicy
     */
    @jakarta.annotation.Nonnull
    public static Windows10CompliancePolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Windows10CompliancePolicy();
    }
    /**
     * Gets the activeFirewallRequired property value. Require active firewall on Windows devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActiveFirewallRequired() {
        return this.activeFirewallRequired;
    }
    /**
     * Gets the antiSpywareRequired property value. Require any AntiSpyware solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAntiSpywareRequired() {
        return this.antiSpywareRequired;
    }
    /**
     * Gets the antivirusRequired property value. Require any Antivirus solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAntivirusRequired() {
        return this.antivirusRequired;
    }
    /**
     * Gets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBitLockerEnabled() {
        return this.bitLockerEnabled;
    }
    /**
     * Gets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCodeIntegrityEnabled() {
        return this.codeIntegrityEnabled;
    }
    /**
     * Gets the configurationManagerComplianceRequired property value. Require to consider SCCM Compliance state into consideration for Intune Compliance State.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getConfigurationManagerComplianceRequired() {
        return this.configurationManagerComplianceRequired;
    }
    /**
     * Gets the defenderEnabled property value. Require Windows Defender Antimalware on Windows devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefenderEnabled() {
        return this.defenderEnabled;
    }
    /**
     * Gets the defenderVersion property value. Require Windows Defender Antimalware minimum version on Windows devices.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDefenderVersion() {
        return this.defenderVersion;
    }
    /**
     * Gets the deviceCompliancePolicyScript property value. Not yet documented
     * @return a DeviceCompliancePolicyScript
     */
    @jakarta.annotation.Nullable
    public DeviceCompliancePolicyScript getDeviceCompliancePolicyScript() {
        return this.deviceCompliancePolicyScript;
    }
    /**
     * Gets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeviceThreatProtectionEnabled() {
        return this.deviceThreatProtectionEnabled;
    }
    /**
     * Gets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @return a DeviceThreatProtectionLevel
     */
    @jakarta.annotation.Nullable
    public DeviceThreatProtectionLevel getDeviceThreatProtectionRequiredSecurityLevel() {
        return this.deviceThreatProtectionRequiredSecurityLevel;
    }
    /**
     * Gets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEarlyLaunchAntiMalwareDriverEnabled() {
        return this.earlyLaunchAntiMalwareDriverEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activeFirewallRequired", (n) -> { this.setActiveFirewallRequired(n.getBooleanValue()); });
        deserializerMap.put("antiSpywareRequired", (n) -> { this.setAntiSpywareRequired(n.getBooleanValue()); });
        deserializerMap.put("antivirusRequired", (n) -> { this.setAntivirusRequired(n.getBooleanValue()); });
        deserializerMap.put("bitLockerEnabled", (n) -> { this.setBitLockerEnabled(n.getBooleanValue()); });
        deserializerMap.put("codeIntegrityEnabled", (n) -> { this.setCodeIntegrityEnabled(n.getBooleanValue()); });
        deserializerMap.put("configurationManagerComplianceRequired", (n) -> { this.setConfigurationManagerComplianceRequired(n.getBooleanValue()); });
        deserializerMap.put("defenderEnabled", (n) -> { this.setDefenderEnabled(n.getBooleanValue()); });
        deserializerMap.put("defenderVersion", (n) -> { this.setDefenderVersion(n.getStringValue()); });
        deserializerMap.put("deviceCompliancePolicyScript", (n) -> { this.setDeviceCompliancePolicyScript(n.getObjectValue(DeviceCompliancePolicyScript::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceThreatProtectionEnabled", (n) -> { this.setDeviceThreatProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("deviceThreatProtectionRequiredSecurityLevel", (n) -> { this.setDeviceThreatProtectionRequiredSecurityLevel(n.getEnumValue(DeviceThreatProtectionLevel.class)); });
        deserializerMap.put("earlyLaunchAntiMalwareDriverEnabled", (n) -> { this.setEarlyLaunchAntiMalwareDriverEnabled(n.getBooleanValue()); });
        deserializerMap.put("firmwareProtectionEnabled", (n) -> { this.setFirmwareProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("kernelDmaProtectionEnabled", (n) -> { this.setKernelDmaProtectionEnabled(n.getBooleanValue()); });
        deserializerMap.put("memoryIntegrityEnabled", (n) -> { this.setMemoryIntegrityEnabled(n.getBooleanValue()); });
        deserializerMap.put("mobileOsMaximumVersion", (n) -> { this.setMobileOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("mobileOsMinimumVersion", (n) -> { this.setMobileOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("osMaximumVersion", (n) -> { this.setOsMaximumVersion(n.getStringValue()); });
        deserializerMap.put("osMinimumVersion", (n) -> { this.setOsMinimumVersion(n.getStringValue()); });
        deserializerMap.put("passwordBlockSimple", (n) -> { this.setPasswordBlockSimple(n.getBooleanValue()); });
        deserializerMap.put("passwordExpirationDays", (n) -> { this.setPasswordExpirationDays(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumCharacterSetCount", (n) -> { this.setPasswordMinimumCharacterSetCount(n.getIntegerValue()); });
        deserializerMap.put("passwordMinimumLength", (n) -> { this.setPasswordMinimumLength(n.getIntegerValue()); });
        deserializerMap.put("passwordMinutesOfInactivityBeforeLock", (n) -> { this.setPasswordMinutesOfInactivityBeforeLock(n.getIntegerValue()); });
        deserializerMap.put("passwordPreviousPasswordBlockCount", (n) -> { this.setPasswordPreviousPasswordBlockCount(n.getIntegerValue()); });
        deserializerMap.put("passwordRequired", (n) -> { this.setPasswordRequired(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredToUnlockFromIdle", (n) -> { this.setPasswordRequiredToUnlockFromIdle(n.getBooleanValue()); });
        deserializerMap.put("passwordRequiredType", (n) -> { this.setPasswordRequiredType(n.getEnumValue(RequiredPasswordType.class)); });
        deserializerMap.put("requireHealthyDeviceReport", (n) -> { this.setRequireHealthyDeviceReport(n.getBooleanValue()); });
        deserializerMap.put("rtpEnabled", (n) -> { this.setRtpEnabled(n.getBooleanValue()); });
        deserializerMap.put("secureBootEnabled", (n) -> { this.setSecureBootEnabled(n.getBooleanValue()); });
        deserializerMap.put("signatureOutOfDate", (n) -> { this.setSignatureOutOfDate(n.getBooleanValue()); });
        deserializerMap.put("storageRequireEncryption", (n) -> { this.setStorageRequireEncryption(n.getBooleanValue()); });
        deserializerMap.put("tpmRequired", (n) -> { this.setTpmRequired(n.getBooleanValue()); });
        deserializerMap.put("validOperatingSystemBuildRanges", (n) -> { this.setValidOperatingSystemBuildRanges(n.getCollectionOfObjectValues(OperatingSystemVersionRange::createFromDiscriminatorValue)); });
        deserializerMap.put("virtualizationBasedSecurityEnabled", (n) -> { this.setVirtualizationBasedSecurityEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firmwareProtectionEnabled property value. When TRUE, indicates that Firmware protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Firmware protection is not required to be reported as healthy. Devices that support either Dynamic Root of Trust for Measurement (DRTM) or Firmware Attack Surface Reduction (FASR) will report compliant for this setting. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirmwareProtectionEnabled() {
        return this.firmwareProtectionEnabled;
    }
    /**
     * Gets the kernelDmaProtectionEnabled property value. When TRUE, indicates that Kernel Direct Memory Access (DMA) protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Kernel DMA Protection is not required to be reported as healthy. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getKernelDmaProtectionEnabled() {
        return this.kernelDmaProtectionEnabled;
    }
    /**
     * Gets the memoryIntegrityEnabled property value. When TRUE, indicates that Memory Integrity as known as Hypervisor-protected Code Integrity (HVCI) or Hypervisor Enforced Code Integrity protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Memory Integrity Protection is not required to be reported as healthy. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getMemoryIntegrityEnabled() {
        return this.memoryIntegrityEnabled;
    }
    /**
     * Gets the mobileOsMaximumVersion property value. Maximum Windows Phone version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMobileOsMaximumVersion() {
        return this.mobileOsMaximumVersion;
    }
    /**
     * Gets the mobileOsMinimumVersion property value. Minimum Windows Phone version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMobileOsMinimumVersion() {
        return this.mobileOsMinimumVersion;
    }
    /**
     * Gets the osMaximumVersion property value. Maximum Windows 10 version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMaximumVersion() {
        return this.osMaximumVersion;
    }
    /**
     * Gets the osMinimumVersion property value. Minimum Windows 10 version.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsMinimumVersion() {
        return this.osMinimumVersion;
    }
    /**
     * Gets the passwordBlockSimple property value. Indicates whether or not to block simple password.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordBlockSimple() {
        return this.passwordBlockSimple;
    }
    /**
     * Gets the passwordExpirationDays property value. The password expiration in days.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordExpirationDays() {
        return this.passwordExpirationDays;
    }
    /**
     * Gets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumCharacterSetCount() {
        return this.passwordMinimumCharacterSetCount;
    }
    /**
     * Gets the passwordMinimumLength property value. The minimum password length.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinimumLength() {
        return this.passwordMinimumLength;
    }
    /**
     * Gets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordMinutesOfInactivityBeforeLock() {
        return this.passwordMinutesOfInactivityBeforeLock;
    }
    /**
     * Gets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPasswordPreviousPasswordBlockCount() {
        return this.passwordPreviousPasswordBlockCount;
    }
    /**
     * Gets the passwordRequired property value. Require a password to unlock Windows device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequired() {
        return this.passwordRequired;
    }
    /**
     * Gets the passwordRequiredToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordRequiredToUnlockFromIdle() {
        return this.passwordRequiredToUnlockFromIdle;
    }
    /**
     * Gets the passwordRequiredType property value. Possible values of required passwords.
     * @return a RequiredPasswordType
     */
    @jakarta.annotation.Nullable
    public RequiredPasswordType getPasswordRequiredType() {
        return this.passwordRequiredType;
    }
    /**
     * Gets the requireHealthyDeviceReport property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRequireHealthyDeviceReport() {
        return this.requireHealthyDeviceReport;
    }
    /**
     * Gets the rtpEnabled property value. Require Windows Defender Antimalware Real-Time Protection on Windows devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRtpEnabled() {
        return this.rtpEnabled;
    }
    /**
     * Gets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSecureBootEnabled() {
        return this.secureBootEnabled;
    }
    /**
     * Gets the signatureOutOfDate property value. Require Windows Defender Antimalware Signature to be up to date on Windows devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSignatureOutOfDate() {
        return this.signatureOutOfDate;
    }
    /**
     * Gets the storageRequireEncryption property value. Require encryption on windows devices.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getStorageRequireEncryption() {
        return this.storageRequireEncryption;
    }
    /**
     * Gets the tpmRequired property value. Require Trusted Platform Module(TPM) to be present.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTpmRequired() {
        return this.tpmRequired;
    }
    /**
     * Gets the validOperatingSystemBuildRanges property value. The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.
     * @return a java.util.List<OperatingSystemVersionRange>
     */
    @jakarta.annotation.Nullable
    public java.util.List<OperatingSystemVersionRange> getValidOperatingSystemBuildRanges() {
        return this.validOperatingSystemBuildRanges;
    }
    /**
     * Gets the virtualizationBasedSecurityEnabled property value. When TRUE, indicates that Virtualization-based Security is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Virtualization-based Security is not required to be reported as healthy. Default value is FALSE.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVirtualizationBasedSecurityEnabled() {
        return this.virtualizationBasedSecurityEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("activeFirewallRequired", this.getActiveFirewallRequired());
        writer.writeBooleanValue("antiSpywareRequired", this.getAntiSpywareRequired());
        writer.writeBooleanValue("antivirusRequired", this.getAntivirusRequired());
        writer.writeBooleanValue("bitLockerEnabled", this.getBitLockerEnabled());
        writer.writeBooleanValue("codeIntegrityEnabled", this.getCodeIntegrityEnabled());
        writer.writeBooleanValue("configurationManagerComplianceRequired", this.getConfigurationManagerComplianceRequired());
        writer.writeBooleanValue("defenderEnabled", this.getDefenderEnabled());
        writer.writeStringValue("defenderVersion", this.getDefenderVersion());
        writer.writeObjectValue("deviceCompliancePolicyScript", this.getDeviceCompliancePolicyScript());
        writer.writeBooleanValue("deviceThreatProtectionEnabled", this.getDeviceThreatProtectionEnabled());
        writer.writeEnumValue("deviceThreatProtectionRequiredSecurityLevel", this.getDeviceThreatProtectionRequiredSecurityLevel());
        writer.writeBooleanValue("earlyLaunchAntiMalwareDriverEnabled", this.getEarlyLaunchAntiMalwareDriverEnabled());
        writer.writeBooleanValue("firmwareProtectionEnabled", this.getFirmwareProtectionEnabled());
        writer.writeBooleanValue("kernelDmaProtectionEnabled", this.getKernelDmaProtectionEnabled());
        writer.writeBooleanValue("memoryIntegrityEnabled", this.getMemoryIntegrityEnabled());
        writer.writeStringValue("mobileOsMaximumVersion", this.getMobileOsMaximumVersion());
        writer.writeStringValue("mobileOsMinimumVersion", this.getMobileOsMinimumVersion());
        writer.writeStringValue("osMaximumVersion", this.getOsMaximumVersion());
        writer.writeStringValue("osMinimumVersion", this.getOsMinimumVersion());
        writer.writeBooleanValue("passwordBlockSimple", this.getPasswordBlockSimple());
        writer.writeIntegerValue("passwordExpirationDays", this.getPasswordExpirationDays());
        writer.writeIntegerValue("passwordMinimumCharacterSetCount", this.getPasswordMinimumCharacterSetCount());
        writer.writeIntegerValue("passwordMinimumLength", this.getPasswordMinimumLength());
        writer.writeIntegerValue("passwordMinutesOfInactivityBeforeLock", this.getPasswordMinutesOfInactivityBeforeLock());
        writer.writeIntegerValue("passwordPreviousPasswordBlockCount", this.getPasswordPreviousPasswordBlockCount());
        writer.writeBooleanValue("passwordRequired", this.getPasswordRequired());
        writer.writeBooleanValue("passwordRequiredToUnlockFromIdle", this.getPasswordRequiredToUnlockFromIdle());
        writer.writeEnumValue("passwordRequiredType", this.getPasswordRequiredType());
        writer.writeBooleanValue("requireHealthyDeviceReport", this.getRequireHealthyDeviceReport());
        writer.writeBooleanValue("rtpEnabled", this.getRtpEnabled());
        writer.writeBooleanValue("secureBootEnabled", this.getSecureBootEnabled());
        writer.writeBooleanValue("signatureOutOfDate", this.getSignatureOutOfDate());
        writer.writeBooleanValue("storageRequireEncryption", this.getStorageRequireEncryption());
        writer.writeBooleanValue("tpmRequired", this.getTpmRequired());
        writer.writeCollectionOfObjectValues("validOperatingSystemBuildRanges", this.getValidOperatingSystemBuildRanges());
        writer.writeBooleanValue("virtualizationBasedSecurityEnabled", this.getVirtualizationBasedSecurityEnabled());
    }
    /**
     * Sets the activeFirewallRequired property value. Require active firewall on Windows devices.
     * @param value Value to set for the activeFirewallRequired property.
     */
    public void setActiveFirewallRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.activeFirewallRequired = value;
    }
    /**
     * Sets the antiSpywareRequired property value. Require any AntiSpyware solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @param value Value to set for the antiSpywareRequired property.
     */
    public void setAntiSpywareRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.antiSpywareRequired = value;
    }
    /**
     * Sets the antivirusRequired property value. Require any Antivirus solution registered with Windows Decurity Center to be on and monitoring (e.g. Symantec, Windows Defender).
     * @param value Value to set for the antivirusRequired property.
     */
    public void setAntivirusRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.antivirusRequired = value;
    }
    /**
     * Sets the bitLockerEnabled property value. Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled
     * @param value Value to set for the bitLockerEnabled property.
     */
    public void setBitLockerEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.bitLockerEnabled = value;
    }
    /**
     * Sets the codeIntegrityEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the codeIntegrityEnabled property.
     */
    public void setCodeIntegrityEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.codeIntegrityEnabled = value;
    }
    /**
     * Sets the configurationManagerComplianceRequired property value. Require to consider SCCM Compliance state into consideration for Intune Compliance State.
     * @param value Value to set for the configurationManagerComplianceRequired property.
     */
    public void setConfigurationManagerComplianceRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.configurationManagerComplianceRequired = value;
    }
    /**
     * Sets the defenderEnabled property value. Require Windows Defender Antimalware on Windows devices.
     * @param value Value to set for the defenderEnabled property.
     */
    public void setDefenderEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.defenderEnabled = value;
    }
    /**
     * Sets the defenderVersion property value. Require Windows Defender Antimalware minimum version on Windows devices.
     * @param value Value to set for the defenderVersion property.
     */
    public void setDefenderVersion(@jakarta.annotation.Nullable final String value) {
        this.defenderVersion = value;
    }
    /**
     * Sets the deviceCompliancePolicyScript property value. Not yet documented
     * @param value Value to set for the deviceCompliancePolicyScript property.
     */
    public void setDeviceCompliancePolicyScript(@jakarta.annotation.Nullable final DeviceCompliancePolicyScript value) {
        this.deviceCompliancePolicyScript = value;
    }
    /**
     * Sets the deviceThreatProtectionEnabled property value. Require that devices have enabled device threat protection.
     * @param value Value to set for the deviceThreatProtectionEnabled property.
     */
    public void setDeviceThreatProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.deviceThreatProtectionEnabled = value;
    }
    /**
     * Sets the deviceThreatProtectionRequiredSecurityLevel property value. Device threat protection levels for the Device Threat Protection API.
     * @param value Value to set for the deviceThreatProtectionRequiredSecurityLevel property.
     */
    public void setDeviceThreatProtectionRequiredSecurityLevel(@jakarta.annotation.Nullable final DeviceThreatProtectionLevel value) {
        this.deviceThreatProtectionRequiredSecurityLevel = value;
    }
    /**
     * Sets the earlyLaunchAntiMalwareDriverEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.
     * @param value Value to set for the earlyLaunchAntiMalwareDriverEnabled property.
     */
    public void setEarlyLaunchAntiMalwareDriverEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.earlyLaunchAntiMalwareDriverEnabled = value;
    }
    /**
     * Sets the firmwareProtectionEnabled property value. When TRUE, indicates that Firmware protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Firmware protection is not required to be reported as healthy. Devices that support either Dynamic Root of Trust for Measurement (DRTM) or Firmware Attack Surface Reduction (FASR) will report compliant for this setting. Default value is FALSE.
     * @param value Value to set for the firmwareProtectionEnabled property.
     */
    public void setFirmwareProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.firmwareProtectionEnabled = value;
    }
    /**
     * Sets the kernelDmaProtectionEnabled property value. When TRUE, indicates that Kernel Direct Memory Access (DMA) protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Kernel DMA Protection is not required to be reported as healthy. Default value is FALSE.
     * @param value Value to set for the kernelDmaProtectionEnabled property.
     */
    public void setKernelDmaProtectionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.kernelDmaProtectionEnabled = value;
    }
    /**
     * Sets the memoryIntegrityEnabled property value. When TRUE, indicates that Memory Integrity as known as Hypervisor-protected Code Integrity (HVCI) or Hypervisor Enforced Code Integrity protection is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Memory Integrity Protection is not required to be reported as healthy. Default value is FALSE.
     * @param value Value to set for the memoryIntegrityEnabled property.
     */
    public void setMemoryIntegrityEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.memoryIntegrityEnabled = value;
    }
    /**
     * Sets the mobileOsMaximumVersion property value. Maximum Windows Phone version.
     * @param value Value to set for the mobileOsMaximumVersion property.
     */
    public void setMobileOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.mobileOsMaximumVersion = value;
    }
    /**
     * Sets the mobileOsMinimumVersion property value. Minimum Windows Phone version.
     * @param value Value to set for the mobileOsMinimumVersion property.
     */
    public void setMobileOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.mobileOsMinimumVersion = value;
    }
    /**
     * Sets the osMaximumVersion property value. Maximum Windows 10 version.
     * @param value Value to set for the osMaximumVersion property.
     */
    public void setOsMaximumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMaximumVersion = value;
    }
    /**
     * Sets the osMinimumVersion property value. Minimum Windows 10 version.
     * @param value Value to set for the osMinimumVersion property.
     */
    public void setOsMinimumVersion(@jakarta.annotation.Nullable final String value) {
        this.osMinimumVersion = value;
    }
    /**
     * Sets the passwordBlockSimple property value. Indicates whether or not to block simple password.
     * @param value Value to set for the passwordBlockSimple property.
     */
    public void setPasswordBlockSimple(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordBlockSimple = value;
    }
    /**
     * Sets the passwordExpirationDays property value. The password expiration in days.
     * @param value Value to set for the passwordExpirationDays property.
     */
    public void setPasswordExpirationDays(@jakarta.annotation.Nullable final Integer value) {
        this.passwordExpirationDays = value;
    }
    /**
     * Sets the passwordMinimumCharacterSetCount property value. The number of character sets required in the password.
     * @param value Value to set for the passwordMinimumCharacterSetCount property.
     */
    public void setPasswordMinimumCharacterSetCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumCharacterSetCount = value;
    }
    /**
     * Sets the passwordMinimumLength property value. The minimum password length.
     * @param value Value to set for the passwordMinimumLength property.
     */
    public void setPasswordMinimumLength(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinimumLength = value;
    }
    /**
     * Sets the passwordMinutesOfInactivityBeforeLock property value. Minutes of inactivity before a password is required.
     * @param value Value to set for the passwordMinutesOfInactivityBeforeLock property.
     */
    public void setPasswordMinutesOfInactivityBeforeLock(@jakarta.annotation.Nullable final Integer value) {
        this.passwordMinutesOfInactivityBeforeLock = value;
    }
    /**
     * Sets the passwordPreviousPasswordBlockCount property value. The number of previous passwords to prevent re-use of.
     * @param value Value to set for the passwordPreviousPasswordBlockCount property.
     */
    public void setPasswordPreviousPasswordBlockCount(@jakarta.annotation.Nullable final Integer value) {
        this.passwordPreviousPasswordBlockCount = value;
    }
    /**
     * Sets the passwordRequired property value. Require a password to unlock Windows device.
     * @param value Value to set for the passwordRequired property.
     */
    public void setPasswordRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordRequired = value;
    }
    /**
     * Sets the passwordRequiredToUnlockFromIdle property value. Require a password to unlock an idle device.
     * @param value Value to set for the passwordRequiredToUnlockFromIdle property.
     */
    public void setPasswordRequiredToUnlockFromIdle(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordRequiredToUnlockFromIdle = value;
    }
    /**
     * Sets the passwordRequiredType property value. Possible values of required passwords.
     * @param value Value to set for the passwordRequiredType property.
     */
    public void setPasswordRequiredType(@jakarta.annotation.Nullable final RequiredPasswordType value) {
        this.passwordRequiredType = value;
    }
    /**
     * Sets the requireHealthyDeviceReport property value. Require devices to be reported as healthy by Windows Device Health Attestation.
     * @param value Value to set for the requireHealthyDeviceReport property.
     */
    public void setRequireHealthyDeviceReport(@jakarta.annotation.Nullable final Boolean value) {
        this.requireHealthyDeviceReport = value;
    }
    /**
     * Sets the rtpEnabled property value. Require Windows Defender Antimalware Real-Time Protection on Windows devices.
     * @param value Value to set for the rtpEnabled property.
     */
    public void setRtpEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.rtpEnabled = value;
    }
    /**
     * Sets the secureBootEnabled property value. Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.
     * @param value Value to set for the secureBootEnabled property.
     */
    public void setSecureBootEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.secureBootEnabled = value;
    }
    /**
     * Sets the signatureOutOfDate property value. Require Windows Defender Antimalware Signature to be up to date on Windows devices.
     * @param value Value to set for the signatureOutOfDate property.
     */
    public void setSignatureOutOfDate(@jakarta.annotation.Nullable final Boolean value) {
        this.signatureOutOfDate = value;
    }
    /**
     * Sets the storageRequireEncryption property value. Require encryption on windows devices.
     * @param value Value to set for the storageRequireEncryption property.
     */
    public void setStorageRequireEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.storageRequireEncryption = value;
    }
    /**
     * Sets the tpmRequired property value. Require Trusted Platform Module(TPM) to be present.
     * @param value Value to set for the tpmRequired property.
     */
    public void setTpmRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.tpmRequired = value;
    }
    /**
     * Sets the validOperatingSystemBuildRanges property value. The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.
     * @param value Value to set for the validOperatingSystemBuildRanges property.
     */
    public void setValidOperatingSystemBuildRanges(@jakarta.annotation.Nullable final java.util.List<OperatingSystemVersionRange> value) {
        this.validOperatingSystemBuildRanges = value;
    }
    /**
     * Sets the virtualizationBasedSecurityEnabled property value. When TRUE, indicates that Virtualization-based Security is required to be reported as healthy by Microsoft Azure Attestion. When FALSE, indicates that Virtualization-based Security is not required to be reported as healthy. Default value is FALSE.
     * @param value Value to set for the virtualizationBasedSecurityEnabled property.
     */
    public void setVirtualizationBasedSecurityEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.virtualizationBasedSecurityEnabled = value;
    }
}
