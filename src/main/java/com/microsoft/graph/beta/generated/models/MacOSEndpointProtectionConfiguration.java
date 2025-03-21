package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS endpoint protection configuration profile.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOSEndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link MacOSEndpointProtectionConfiguration} and sets the default values.
     */
    public MacOSEndpointProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSEndpointProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOSEndpointProtectionConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static MacOSEndpointProtectionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSEndpointProtectionConfiguration();
    }
    /**
     * Gets the advancedThreatProtectionAutomaticSampleSubmission property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionAutomaticSampleSubmission() {
        return this.backingStore.get("advancedThreatProtectionAutomaticSampleSubmission");
    }
    /**
     * Gets the advancedThreatProtectionCloudDelivered property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionCloudDelivered() {
        return this.backingStore.get("advancedThreatProtectionCloudDelivered");
    }
    /**
     * Gets the advancedThreatProtectionDiagnosticDataCollection property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionDiagnosticDataCollection() {
        return this.backingStore.get("advancedThreatProtectionDiagnosticDataCollection");
    }
    /**
     * Gets the advancedThreatProtectionExcludedExtensions property value. A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedExtensions() {
        return this.backingStore.get("advancedThreatProtectionExcludedExtensions");
    }
    /**
     * Gets the advancedThreatProtectionExcludedFiles property value. A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedFiles() {
        return this.backingStore.get("advancedThreatProtectionExcludedFiles");
    }
    /**
     * Gets the advancedThreatProtectionExcludedFolders property value. A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedFolders() {
        return this.backingStore.get("advancedThreatProtectionExcludedFolders");
    }
    /**
     * Gets the advancedThreatProtectionExcludedProcesses property value. A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedProcesses() {
        return this.backingStore.get("advancedThreatProtectionExcludedProcesses");
    }
    /**
     * Gets the advancedThreatProtectionRealTime property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionRealTime() {
        return this.backingStore.get("advancedThreatProtectionRealTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedThreatProtectionAutomaticSampleSubmission", (n) -> { this.setAdvancedThreatProtectionAutomaticSampleSubmission(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("advancedThreatProtectionCloudDelivered", (n) -> { this.setAdvancedThreatProtectionCloudDelivered(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("advancedThreatProtectionDiagnosticDataCollection", (n) -> { this.setAdvancedThreatProtectionDiagnosticDataCollection(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("advancedThreatProtectionExcludedExtensions", (n) -> { this.setAdvancedThreatProtectionExcludedExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedFiles", (n) -> { this.setAdvancedThreatProtectionExcludedFiles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedFolders", (n) -> { this.setAdvancedThreatProtectionExcludedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedProcesses", (n) -> { this.setAdvancedThreatProtectionExcludedProcesses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionRealTime", (n) -> { this.setAdvancedThreatProtectionRealTime(n.getEnumValue(Enablement::forValue)); });
        deserializerMap.put("fileVaultAllowDeferralUntilSignOut", (n) -> { this.setFileVaultAllowDeferralUntilSignOut(n.getBooleanValue()); });
        deserializerMap.put("fileVaultDisablePromptAtSignOut", (n) -> { this.setFileVaultDisablePromptAtSignOut(n.getBooleanValue()); });
        deserializerMap.put("fileVaultEnabled", (n) -> { this.setFileVaultEnabled(n.getBooleanValue()); });
        deserializerMap.put("fileVaultHidePersonalRecoveryKey", (n) -> { this.setFileVaultHidePersonalRecoveryKey(n.getBooleanValue()); });
        deserializerMap.put("fileVaultInstitutionalRecoveryKeyCertificate", (n) -> { this.setFileVaultInstitutionalRecoveryKeyCertificate(n.getByteArrayValue()); });
        deserializerMap.put("fileVaultInstitutionalRecoveryKeyCertificateFileName", (n) -> { this.setFileVaultInstitutionalRecoveryKeyCertificateFileName(n.getStringValue()); });
        deserializerMap.put("fileVaultNumberOfTimesUserCanIgnore", (n) -> { this.setFileVaultNumberOfTimesUserCanIgnore(n.getIntegerValue()); });
        deserializerMap.put("fileVaultPersonalRecoveryKeyHelpMessage", (n) -> { this.setFileVaultPersonalRecoveryKeyHelpMessage(n.getStringValue()); });
        deserializerMap.put("fileVaultPersonalRecoveryKeyRotationInMonths", (n) -> { this.setFileVaultPersonalRecoveryKeyRotationInMonths(n.getIntegerValue()); });
        deserializerMap.put("fileVaultSelectedRecoveryKeyTypes", (n) -> { this.setFileVaultSelectedRecoveryKeyTypes(n.getEnumSetValue(MacOSFileVaultRecoveryKeyTypes::forValue)); });
        deserializerMap.put("firewallApplications", (n) -> { this.setFirewallApplications(n.getCollectionOfObjectValues(MacOSFirewallApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallBlockAllIncoming", (n) -> { this.setFirewallBlockAllIncoming(n.getBooleanValue()); });
        deserializerMap.put("firewallEnabled", (n) -> { this.setFirewallEnabled(n.getBooleanValue()); });
        deserializerMap.put("firewallEnableStealthMode", (n) -> { this.setFirewallEnableStealthMode(n.getBooleanValue()); });
        deserializerMap.put("gatekeeperAllowedAppSource", (n) -> { this.setGatekeeperAllowedAppSource(n.getEnumValue(MacOSGatekeeperAppSources::forValue)); });
        deserializerMap.put("gatekeeperBlockOverride", (n) -> { this.setGatekeeperBlockOverride(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileVaultAllowDeferralUntilSignOut property value. Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultAllowDeferralUntilSignOut() {
        return this.backingStore.get("fileVaultAllowDeferralUntilSignOut");
    }
    /**
     * Gets the fileVaultDisablePromptAtSignOut property value. Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultDisablePromptAtSignOut() {
        return this.backingStore.get("fileVaultDisablePromptAtSignOut");
    }
    /**
     * Gets the fileVaultEnabled property value. Whether FileVault should be enabled or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultEnabled() {
        return this.backingStore.get("fileVaultEnabled");
    }
    /**
     * Gets the fileVaultHidePersonalRecoveryKey property value. Optional. A hidden personal recovery key does not appear on the user&apos;s screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultHidePersonalRecoveryKey() {
        return this.backingStore.get("fileVaultHidePersonalRecoveryKey");
    }
    /**
     * Gets the fileVaultInstitutionalRecoveryKeyCertificate property value. Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     * @return a {@link byte[]}
     */
    @jakarta.annotation.Nullable
    public byte[] getFileVaultInstitutionalRecoveryKeyCertificate() {
        return this.backingStore.get("fileVaultInstitutionalRecoveryKeyCertificate");
    }
    /**
     * Gets the fileVaultInstitutionalRecoveryKeyCertificateFileName property value. File name of the institutional recovery key certificate to display in UI. (.der).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileVaultInstitutionalRecoveryKeyCertificateFileName() {
        return this.backingStore.get("fileVaultInstitutionalRecoveryKeyCertificateFileName");
    }
    /**
     * Gets the fileVaultNumberOfTimesUserCanIgnore property value. Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFileVaultNumberOfTimesUserCanIgnore() {
        return this.backingStore.get("fileVaultNumberOfTimesUserCanIgnore");
    }
    /**
     * Gets the fileVaultPersonalRecoveryKeyHelpMessage property value. Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFileVaultPersonalRecoveryKeyHelpMessage() {
        return this.backingStore.get("fileVaultPersonalRecoveryKeyHelpMessage");
    }
    /**
     * Gets the fileVaultPersonalRecoveryKeyRotationInMonths property value. Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFileVaultPersonalRecoveryKeyRotationInMonths() {
        return this.backingStore.get("fileVaultPersonalRecoveryKeyRotationInMonths");
    }
    /**
     * Gets the fileVaultSelectedRecoveryKeyTypes property value. Recovery key types for macOS FileVault
     * @return a {@link EnumSet<MacOSFileVaultRecoveryKeyTypes>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<MacOSFileVaultRecoveryKeyTypes> getFileVaultSelectedRecoveryKeyTypes() {
        return this.backingStore.get("fileVaultSelectedRecoveryKeyTypes");
    }
    /**
     * Gets the firewallApplications property value. List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     * @return a {@link java.util.List<MacOSFirewallApplication>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSFirewallApplication> getFirewallApplications() {
        return this.backingStore.get("firewallApplications");
    }
    /**
     * Gets the firewallBlockAllIncoming property value. Corresponds to the &apos;Block all incoming connections&apos; option.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallBlockAllIncoming() {
        return this.backingStore.get("firewallBlockAllIncoming");
    }
    /**
     * Gets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnabled() {
        return this.backingStore.get("firewallEnabled");
    }
    /**
     * Gets the firewallEnableStealthMode property value. Corresponds to &apos;Enable stealth mode.&apos;
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnableStealthMode() {
        return this.backingStore.get("firewallEnableStealthMode");
    }
    /**
     * Gets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @return a {@link MacOSGatekeeperAppSources}
     */
    @jakarta.annotation.Nullable
    public MacOSGatekeeperAppSources getGatekeeperAllowedAppSource() {
        return this.backingStore.get("gatekeeperAllowedAppSource");
    }
    /**
     * Gets the gatekeeperBlockOverride property value. If set to true, the user override for Gatekeeper will be disabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getGatekeeperBlockOverride() {
        return this.backingStore.get("gatekeeperBlockOverride");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("advancedThreatProtectionAutomaticSampleSubmission", this.getAdvancedThreatProtectionAutomaticSampleSubmission());
        writer.writeEnumValue("advancedThreatProtectionCloudDelivered", this.getAdvancedThreatProtectionCloudDelivered());
        writer.writeEnumValue("advancedThreatProtectionDiagnosticDataCollection", this.getAdvancedThreatProtectionDiagnosticDataCollection());
        writer.writeCollectionOfPrimitiveValues("advancedThreatProtectionExcludedExtensions", this.getAdvancedThreatProtectionExcludedExtensions());
        writer.writeCollectionOfPrimitiveValues("advancedThreatProtectionExcludedFiles", this.getAdvancedThreatProtectionExcludedFiles());
        writer.writeCollectionOfPrimitiveValues("advancedThreatProtectionExcludedFolders", this.getAdvancedThreatProtectionExcludedFolders());
        writer.writeCollectionOfPrimitiveValues("advancedThreatProtectionExcludedProcesses", this.getAdvancedThreatProtectionExcludedProcesses());
        writer.writeEnumValue("advancedThreatProtectionRealTime", this.getAdvancedThreatProtectionRealTime());
        writer.writeBooleanValue("fileVaultAllowDeferralUntilSignOut", this.getFileVaultAllowDeferralUntilSignOut());
        writer.writeBooleanValue("fileVaultDisablePromptAtSignOut", this.getFileVaultDisablePromptAtSignOut());
        writer.writeBooleanValue("fileVaultEnabled", this.getFileVaultEnabled());
        writer.writeBooleanValue("fileVaultHidePersonalRecoveryKey", this.getFileVaultHidePersonalRecoveryKey());
        writer.writeByteArrayValue("fileVaultInstitutionalRecoveryKeyCertificate", this.getFileVaultInstitutionalRecoveryKeyCertificate());
        writer.writeStringValue("fileVaultInstitutionalRecoveryKeyCertificateFileName", this.getFileVaultInstitutionalRecoveryKeyCertificateFileName());
        writer.writeIntegerValue("fileVaultNumberOfTimesUserCanIgnore", this.getFileVaultNumberOfTimesUserCanIgnore());
        writer.writeStringValue("fileVaultPersonalRecoveryKeyHelpMessage", this.getFileVaultPersonalRecoveryKeyHelpMessage());
        writer.writeIntegerValue("fileVaultPersonalRecoveryKeyRotationInMonths", this.getFileVaultPersonalRecoveryKeyRotationInMonths());
        writer.writeEnumSetValue("fileVaultSelectedRecoveryKeyTypes", this.getFileVaultSelectedRecoveryKeyTypes());
        writer.writeCollectionOfObjectValues("firewallApplications", this.getFirewallApplications());
        writer.writeBooleanValue("firewallBlockAllIncoming", this.getFirewallBlockAllIncoming());
        writer.writeBooleanValue("firewallEnabled", this.getFirewallEnabled());
        writer.writeBooleanValue("firewallEnableStealthMode", this.getFirewallEnableStealthMode());
        writer.writeEnumValue("gatekeeperAllowedAppSource", this.getGatekeeperAllowedAppSource());
        writer.writeBooleanValue("gatekeeperBlockOverride", this.getGatekeeperBlockOverride());
    }
    /**
     * Sets the advancedThreatProtectionAutomaticSampleSubmission property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionAutomaticSampleSubmission property.
     */
    public void setAdvancedThreatProtectionAutomaticSampleSubmission(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("advancedThreatProtectionAutomaticSampleSubmission", value);
    }
    /**
     * Sets the advancedThreatProtectionCloudDelivered property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionCloudDelivered property.
     */
    public void setAdvancedThreatProtectionCloudDelivered(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("advancedThreatProtectionCloudDelivered", value);
    }
    /**
     * Sets the advancedThreatProtectionDiagnosticDataCollection property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionDiagnosticDataCollection property.
     */
    public void setAdvancedThreatProtectionDiagnosticDataCollection(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("advancedThreatProtectionDiagnosticDataCollection", value);
    }
    /**
     * Sets the advancedThreatProtectionExcludedExtensions property value. A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedExtensions property.
     */
    public void setAdvancedThreatProtectionExcludedExtensions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("advancedThreatProtectionExcludedExtensions", value);
    }
    /**
     * Sets the advancedThreatProtectionExcludedFiles property value. A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedFiles property.
     */
    public void setAdvancedThreatProtectionExcludedFiles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("advancedThreatProtectionExcludedFiles", value);
    }
    /**
     * Sets the advancedThreatProtectionExcludedFolders property value. A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedFolders property.
     */
    public void setAdvancedThreatProtectionExcludedFolders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("advancedThreatProtectionExcludedFolders", value);
    }
    /**
     * Sets the advancedThreatProtectionExcludedProcesses property value. A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedProcesses property.
     */
    public void setAdvancedThreatProtectionExcludedProcesses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("advancedThreatProtectionExcludedProcesses", value);
    }
    /**
     * Sets the advancedThreatProtectionRealTime property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionRealTime property.
     */
    public void setAdvancedThreatProtectionRealTime(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("advancedThreatProtectionRealTime", value);
    }
    /**
     * Sets the fileVaultAllowDeferralUntilSignOut property value. Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     * @param value Value to set for the fileVaultAllowDeferralUntilSignOut property.
     */
    public void setFileVaultAllowDeferralUntilSignOut(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fileVaultAllowDeferralUntilSignOut", value);
    }
    /**
     * Sets the fileVaultDisablePromptAtSignOut property value. Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     * @param value Value to set for the fileVaultDisablePromptAtSignOut property.
     */
    public void setFileVaultDisablePromptAtSignOut(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fileVaultDisablePromptAtSignOut", value);
    }
    /**
     * Sets the fileVaultEnabled property value. Whether FileVault should be enabled or not.
     * @param value Value to set for the fileVaultEnabled property.
     */
    public void setFileVaultEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fileVaultEnabled", value);
    }
    /**
     * Sets the fileVaultHidePersonalRecoveryKey property value. Optional. A hidden personal recovery key does not appear on the user&apos;s screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     * @param value Value to set for the fileVaultHidePersonalRecoveryKey property.
     */
    public void setFileVaultHidePersonalRecoveryKey(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("fileVaultHidePersonalRecoveryKey", value);
    }
    /**
     * Sets the fileVaultInstitutionalRecoveryKeyCertificate property value. Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     * @param value Value to set for the fileVaultInstitutionalRecoveryKeyCertificate property.
     */
    public void setFileVaultInstitutionalRecoveryKeyCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.backingStore.set("fileVaultInstitutionalRecoveryKeyCertificate", value);
    }
    /**
     * Sets the fileVaultInstitutionalRecoveryKeyCertificateFileName property value. File name of the institutional recovery key certificate to display in UI. (.der).
     * @param value Value to set for the fileVaultInstitutionalRecoveryKeyCertificateFileName property.
     */
    public void setFileVaultInstitutionalRecoveryKeyCertificateFileName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileVaultInstitutionalRecoveryKeyCertificateFileName", value);
    }
    /**
     * Sets the fileVaultNumberOfTimesUserCanIgnore property value. Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     * @param value Value to set for the fileVaultNumberOfTimesUserCanIgnore property.
     */
    public void setFileVaultNumberOfTimesUserCanIgnore(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("fileVaultNumberOfTimesUserCanIgnore", value);
    }
    /**
     * Sets the fileVaultPersonalRecoveryKeyHelpMessage property value. Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     * @param value Value to set for the fileVaultPersonalRecoveryKeyHelpMessage property.
     */
    public void setFileVaultPersonalRecoveryKeyHelpMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("fileVaultPersonalRecoveryKeyHelpMessage", value);
    }
    /**
     * Sets the fileVaultPersonalRecoveryKeyRotationInMonths property value. Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     * @param value Value to set for the fileVaultPersonalRecoveryKeyRotationInMonths property.
     */
    public void setFileVaultPersonalRecoveryKeyRotationInMonths(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("fileVaultPersonalRecoveryKeyRotationInMonths", value);
    }
    /**
     * Sets the fileVaultSelectedRecoveryKeyTypes property value. Recovery key types for macOS FileVault
     * @param value Value to set for the fileVaultSelectedRecoveryKeyTypes property.
     */
    public void setFileVaultSelectedRecoveryKeyTypes(@jakarta.annotation.Nullable final EnumSet<MacOSFileVaultRecoveryKeyTypes> value) {
        this.backingStore.set("fileVaultSelectedRecoveryKeyTypes", value);
    }
    /**
     * Sets the firewallApplications property value. List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the firewallApplications property.
     */
    public void setFirewallApplications(@jakarta.annotation.Nullable final java.util.List<MacOSFirewallApplication> value) {
        this.backingStore.set("firewallApplications", value);
    }
    /**
     * Sets the firewallBlockAllIncoming property value. Corresponds to the &apos;Block all incoming connections&apos; option.
     * @param value Value to set for the firewallBlockAllIncoming property.
     */
    public void setFirewallBlockAllIncoming(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallBlockAllIncoming", value);
    }
    /**
     * Sets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @param value Value to set for the firewallEnabled property.
     */
    public void setFirewallEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallEnabled", value);
    }
    /**
     * Sets the firewallEnableStealthMode property value. Corresponds to &apos;Enable stealth mode.&apos;
     * @param value Value to set for the firewallEnableStealthMode property.
     */
    public void setFirewallEnableStealthMode(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("firewallEnableStealthMode", value);
    }
    /**
     * Sets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @param value Value to set for the gatekeeperAllowedAppSource property.
     */
    public void setGatekeeperAllowedAppSource(@jakarta.annotation.Nullable final MacOSGatekeeperAppSources value) {
        this.backingStore.set("gatekeeperAllowedAppSource", value);
    }
    /**
     * Sets the gatekeeperBlockOverride property value. If set to true, the user override for Gatekeeper will be disabled.
     * @param value Value to set for the gatekeeperBlockOverride property.
     */
    public void setGatekeeperBlockOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("gatekeeperBlockOverride", value);
    }
}
