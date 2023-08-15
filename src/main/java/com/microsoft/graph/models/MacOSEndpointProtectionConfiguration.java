package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * MacOS endpoint protection configuration profile.
 */
public class MacOSEndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Possible values of a property
     */
    private Enablement advancedThreatProtectionAutomaticSampleSubmission;
    /**
     * Possible values of a property
     */
    private Enablement advancedThreatProtectionCloudDelivered;
    /**
     * Possible values of a property
     */
    private Enablement advancedThreatProtectionDiagnosticDataCollection;
    /**
     * A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    private java.util.List<String> advancedThreatProtectionExcludedExtensions;
    /**
     * A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    private java.util.List<String> advancedThreatProtectionExcludedFiles;
    /**
     * A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    private java.util.List<String> advancedThreatProtectionExcludedFolders;
    /**
     * A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     */
    private java.util.List<String> advancedThreatProtectionExcludedProcesses;
    /**
     * Possible values of a property
     */
    private Enablement advancedThreatProtectionRealTime;
    /**
     * Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     */
    private Boolean fileVaultAllowDeferralUntilSignOut;
    /**
     * Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     */
    private Boolean fileVaultDisablePromptAtSignOut;
    /**
     * Whether FileVault should be enabled or not.
     */
    private Boolean fileVaultEnabled;
    /**
     * Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     */
    private Boolean fileVaultHidePersonalRecoveryKey;
    /**
     * Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     */
    private byte[] fileVaultInstitutionalRecoveryKeyCertificate;
    /**
     * File name of the institutional recovery key certificate to display in UI. (.der).
     */
    private String fileVaultInstitutionalRecoveryKeyCertificateFileName;
    /**
     * Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     */
    private Integer fileVaultNumberOfTimesUserCanIgnore;
    /**
     * Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     */
    private String fileVaultPersonalRecoveryKeyHelpMessage;
    /**
     * Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     */
    private Integer fileVaultPersonalRecoveryKeyRotationInMonths;
    /**
     * Recovery key types for macOS FileVault
     */
    private MacOSFileVaultRecoveryKeyTypes fileVaultSelectedRecoveryKeyTypes;
    /**
     * List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     */
    private java.util.List<MacOSFirewallApplication> firewallApplications;
    /**
     * Corresponds to the 'Block all incoming connections' option.
     */
    private Boolean firewallBlockAllIncoming;
    /**
     * Whether the firewall should be enabled or not.
     */
    private Boolean firewallEnabled;
    /**
     * Corresponds to 'Enable stealth mode.'
     */
    private Boolean firewallEnableStealthMode;
    /**
     * App source options for macOS Gatekeeper.
     */
    private MacOSGatekeeperAppSources gatekeeperAllowedAppSource;
    /**
     * If set to true, the user override for Gatekeeper will be disabled.
     */
    private Boolean gatekeeperBlockOverride;
    /**
     * Instantiates a new macOSEndpointProtectionConfiguration and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MacOSEndpointProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSEndpointProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSEndpointProtectionConfiguration
     */
    @jakarta.annotation.Nonnull
    public static MacOSEndpointProtectionConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSEndpointProtectionConfiguration();
    }
    /**
     * Gets the advancedThreatProtectionAutomaticSampleSubmission property value. Possible values of a property
     * @return a enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionAutomaticSampleSubmission() {
        return this.advancedThreatProtectionAutomaticSampleSubmission;
    }
    /**
     * Gets the advancedThreatProtectionCloudDelivered property value. Possible values of a property
     * @return a enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionCloudDelivered() {
        return this.advancedThreatProtectionCloudDelivered;
    }
    /**
     * Gets the advancedThreatProtectionDiagnosticDataCollection property value. Possible values of a property
     * @return a enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionDiagnosticDataCollection() {
        return this.advancedThreatProtectionDiagnosticDataCollection;
    }
    /**
     * Gets the advancedThreatProtectionExcludedExtensions property value. A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedExtensions() {
        return this.advancedThreatProtectionExcludedExtensions;
    }
    /**
     * Gets the advancedThreatProtectionExcludedFiles property value. A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedFiles() {
        return this.advancedThreatProtectionExcludedFiles;
    }
    /**
     * Gets the advancedThreatProtectionExcludedFolders property value. A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedFolders() {
        return this.advancedThreatProtectionExcludedFolders;
    }
    /**
     * Gets the advancedThreatProtectionExcludedProcesses property value. A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedProcesses() {
        return this.advancedThreatProtectionExcludedProcesses;
    }
    /**
     * Gets the advancedThreatProtectionRealTime property value. Possible values of a property
     * @return a enablement
     */
    @jakarta.annotation.Nullable
    public Enablement getAdvancedThreatProtectionRealTime() {
        return this.advancedThreatProtectionRealTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedThreatProtectionAutomaticSampleSubmission", (n) -> { this.setAdvancedThreatProtectionAutomaticSampleSubmission(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("advancedThreatProtectionCloudDelivered", (n) -> { this.setAdvancedThreatProtectionCloudDelivered(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("advancedThreatProtectionDiagnosticDataCollection", (n) -> { this.setAdvancedThreatProtectionDiagnosticDataCollection(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedExtensions", (n) -> { this.setAdvancedThreatProtectionExcludedExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedFiles", (n) -> { this.setAdvancedThreatProtectionExcludedFiles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedFolders", (n) -> { this.setAdvancedThreatProtectionExcludedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedProcesses", (n) -> { this.setAdvancedThreatProtectionExcludedProcesses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionRealTime", (n) -> { this.setAdvancedThreatProtectionRealTime(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("fileVaultAllowDeferralUntilSignOut", (n) -> { this.setFileVaultAllowDeferralUntilSignOut(n.getBooleanValue()); });
        deserializerMap.put("fileVaultDisablePromptAtSignOut", (n) -> { this.setFileVaultDisablePromptAtSignOut(n.getBooleanValue()); });
        deserializerMap.put("fileVaultEnabled", (n) -> { this.setFileVaultEnabled(n.getBooleanValue()); });
        deserializerMap.put("fileVaultHidePersonalRecoveryKey", (n) -> { this.setFileVaultHidePersonalRecoveryKey(n.getBooleanValue()); });
        deserializerMap.put("fileVaultInstitutionalRecoveryKeyCertificate", (n) -> { this.setFileVaultInstitutionalRecoveryKeyCertificate(n.getByteArrayValue()); });
        deserializerMap.put("fileVaultInstitutionalRecoveryKeyCertificateFileName", (n) -> { this.setFileVaultInstitutionalRecoveryKeyCertificateFileName(n.getStringValue()); });
        deserializerMap.put("fileVaultNumberOfTimesUserCanIgnore", (n) -> { this.setFileVaultNumberOfTimesUserCanIgnore(n.getIntegerValue()); });
        deserializerMap.put("fileVaultPersonalRecoveryKeyHelpMessage", (n) -> { this.setFileVaultPersonalRecoveryKeyHelpMessage(n.getStringValue()); });
        deserializerMap.put("fileVaultPersonalRecoveryKeyRotationInMonths", (n) -> { this.setFileVaultPersonalRecoveryKeyRotationInMonths(n.getIntegerValue()); });
        deserializerMap.put("fileVaultSelectedRecoveryKeyTypes", (n) -> { this.setFileVaultSelectedRecoveryKeyTypes(n.getEnumValue(MacOSFileVaultRecoveryKeyTypes.class)); });
        deserializerMap.put("firewallApplications", (n) -> { this.setFirewallApplications(n.getCollectionOfObjectValues(MacOSFirewallApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallBlockAllIncoming", (n) -> { this.setFirewallBlockAllIncoming(n.getBooleanValue()); });
        deserializerMap.put("firewallEnabled", (n) -> { this.setFirewallEnabled(n.getBooleanValue()); });
        deserializerMap.put("firewallEnableStealthMode", (n) -> { this.setFirewallEnableStealthMode(n.getBooleanValue()); });
        deserializerMap.put("gatekeeperAllowedAppSource", (n) -> { this.setGatekeeperAllowedAppSource(n.getEnumValue(MacOSGatekeeperAppSources.class)); });
        deserializerMap.put("gatekeeperBlockOverride", (n) -> { this.setGatekeeperBlockOverride(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileVaultAllowDeferralUntilSignOut property value. Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultAllowDeferralUntilSignOut() {
        return this.fileVaultAllowDeferralUntilSignOut;
    }
    /**
     * Gets the fileVaultDisablePromptAtSignOut property value. Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultDisablePromptAtSignOut() {
        return this.fileVaultDisablePromptAtSignOut;
    }
    /**
     * Gets the fileVaultEnabled property value. Whether FileVault should be enabled or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultEnabled() {
        return this.fileVaultEnabled;
    }
    /**
     * Gets the fileVaultHidePersonalRecoveryKey property value. Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFileVaultHidePersonalRecoveryKey() {
        return this.fileVaultHidePersonalRecoveryKey;
    }
    /**
     * Gets the fileVaultInstitutionalRecoveryKeyCertificate property value. Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     * @return a base64url
     */
    @jakarta.annotation.Nullable
    public byte[] getFileVaultInstitutionalRecoveryKeyCertificate() {
        return this.fileVaultInstitutionalRecoveryKeyCertificate;
    }
    /**
     * Gets the fileVaultInstitutionalRecoveryKeyCertificateFileName property value. File name of the institutional recovery key certificate to display in UI. (.der).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileVaultInstitutionalRecoveryKeyCertificateFileName() {
        return this.fileVaultInstitutionalRecoveryKeyCertificateFileName;
    }
    /**
     * Gets the fileVaultNumberOfTimesUserCanIgnore property value. Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFileVaultNumberOfTimesUserCanIgnore() {
        return this.fileVaultNumberOfTimesUserCanIgnore;
    }
    /**
     * Gets the fileVaultPersonalRecoveryKeyHelpMessage property value. Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileVaultPersonalRecoveryKeyHelpMessage() {
        return this.fileVaultPersonalRecoveryKeyHelpMessage;
    }
    /**
     * Gets the fileVaultPersonalRecoveryKeyRotationInMonths property value. Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getFileVaultPersonalRecoveryKeyRotationInMonths() {
        return this.fileVaultPersonalRecoveryKeyRotationInMonths;
    }
    /**
     * Gets the fileVaultSelectedRecoveryKeyTypes property value. Recovery key types for macOS FileVault
     * @return a macOSFileVaultRecoveryKeyTypes
     */
    @jakarta.annotation.Nullable
    public MacOSFileVaultRecoveryKeyTypes getFileVaultSelectedRecoveryKeyTypes() {
        return this.fileVaultSelectedRecoveryKeyTypes;
    }
    /**
     * Gets the firewallApplications property value. List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     * @return a macOSFirewallApplication
     */
    @jakarta.annotation.Nullable
    public java.util.List<MacOSFirewallApplication> getFirewallApplications() {
        return this.firewallApplications;
    }
    /**
     * Gets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallBlockAllIncoming() {
        return this.firewallBlockAllIncoming;
    }
    /**
     * Gets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnabled() {
        return this.firewallEnabled;
    }
    /**
     * Gets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFirewallEnableStealthMode() {
        return this.firewallEnableStealthMode;
    }
    /**
     * Gets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @return a macOSGatekeeperAppSources
     */
    @jakarta.annotation.Nullable
    public MacOSGatekeeperAppSources getGatekeeperAllowedAppSource() {
        return this.gatekeeperAllowedAppSource;
    }
    /**
     * Gets the gatekeeperBlockOverride property value. If set to true, the user override for Gatekeeper will be disabled.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getGatekeeperBlockOverride() {
        return this.gatekeeperBlockOverride;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
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
        writer.writeEnumValue("fileVaultSelectedRecoveryKeyTypes", this.getFileVaultSelectedRecoveryKeyTypes());
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionAutomaticSampleSubmission(@jakarta.annotation.Nullable final Enablement value) {
        this.advancedThreatProtectionAutomaticSampleSubmission = value;
    }
    /**
     * Sets the advancedThreatProtectionCloudDelivered property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionCloudDelivered property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionCloudDelivered(@jakarta.annotation.Nullable final Enablement value) {
        this.advancedThreatProtectionCloudDelivered = value;
    }
    /**
     * Sets the advancedThreatProtectionDiagnosticDataCollection property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionDiagnosticDataCollection property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionDiagnosticDataCollection(@jakarta.annotation.Nullable final Enablement value) {
        this.advancedThreatProtectionDiagnosticDataCollection = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedExtensions property value. A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedExtensions property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedExtensions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.advancedThreatProtectionExcludedExtensions = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedFiles property value. A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedFiles property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedFiles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.advancedThreatProtectionExcludedFiles = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedFolders property value. A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedFolders property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedFolders(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.advancedThreatProtectionExcludedFolders = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedProcesses property value. A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedProcesses property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedProcesses(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.advancedThreatProtectionExcludedProcesses = value;
    }
    /**
     * Sets the advancedThreatProtectionRealTime property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionRealTime property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdvancedThreatProtectionRealTime(@jakarta.annotation.Nullable final Enablement value) {
        this.advancedThreatProtectionRealTime = value;
    }
    /**
     * Sets the fileVaultAllowDeferralUntilSignOut property value. Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     * @param value Value to set for the fileVaultAllowDeferralUntilSignOut property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultAllowDeferralUntilSignOut(@jakarta.annotation.Nullable final Boolean value) {
        this.fileVaultAllowDeferralUntilSignOut = value;
    }
    /**
     * Sets the fileVaultDisablePromptAtSignOut property value. Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     * @param value Value to set for the fileVaultDisablePromptAtSignOut property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultDisablePromptAtSignOut(@jakarta.annotation.Nullable final Boolean value) {
        this.fileVaultDisablePromptAtSignOut = value;
    }
    /**
     * Sets the fileVaultEnabled property value. Whether FileVault should be enabled or not.
     * @param value Value to set for the fileVaultEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.fileVaultEnabled = value;
    }
    /**
     * Sets the fileVaultHidePersonalRecoveryKey property value. Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     * @param value Value to set for the fileVaultHidePersonalRecoveryKey property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultHidePersonalRecoveryKey(@jakarta.annotation.Nullable final Boolean value) {
        this.fileVaultHidePersonalRecoveryKey = value;
    }
    /**
     * Sets the fileVaultInstitutionalRecoveryKeyCertificate property value. Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     * @param value Value to set for the fileVaultInstitutionalRecoveryKeyCertificate property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultInstitutionalRecoveryKeyCertificate(@jakarta.annotation.Nullable final byte[] value) {
        this.fileVaultInstitutionalRecoveryKeyCertificate = value;
    }
    /**
     * Sets the fileVaultInstitutionalRecoveryKeyCertificateFileName property value. File name of the institutional recovery key certificate to display in UI. (.der).
     * @param value Value to set for the fileVaultInstitutionalRecoveryKeyCertificateFileName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultInstitutionalRecoveryKeyCertificateFileName(@jakarta.annotation.Nullable final String value) {
        this.fileVaultInstitutionalRecoveryKeyCertificateFileName = value;
    }
    /**
     * Sets the fileVaultNumberOfTimesUserCanIgnore property value. Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     * @param value Value to set for the fileVaultNumberOfTimesUserCanIgnore property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultNumberOfTimesUserCanIgnore(@jakarta.annotation.Nullable final Integer value) {
        this.fileVaultNumberOfTimesUserCanIgnore = value;
    }
    /**
     * Sets the fileVaultPersonalRecoveryKeyHelpMessage property value. Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     * @param value Value to set for the fileVaultPersonalRecoveryKeyHelpMessage property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultPersonalRecoveryKeyHelpMessage(@jakarta.annotation.Nullable final String value) {
        this.fileVaultPersonalRecoveryKeyHelpMessage = value;
    }
    /**
     * Sets the fileVaultPersonalRecoveryKeyRotationInMonths property value. Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     * @param value Value to set for the fileVaultPersonalRecoveryKeyRotationInMonths property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultPersonalRecoveryKeyRotationInMonths(@jakarta.annotation.Nullable final Integer value) {
        this.fileVaultPersonalRecoveryKeyRotationInMonths = value;
    }
    /**
     * Sets the fileVaultSelectedRecoveryKeyTypes property value. Recovery key types for macOS FileVault
     * @param value Value to set for the fileVaultSelectedRecoveryKeyTypes property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFileVaultSelectedRecoveryKeyTypes(@jakarta.annotation.Nullable final MacOSFileVaultRecoveryKeyTypes value) {
        this.fileVaultSelectedRecoveryKeyTypes = value;
    }
    /**
     * Sets the firewallApplications property value. List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the firewallApplications property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirewallApplications(@jakarta.annotation.Nullable final java.util.List<MacOSFirewallApplication> value) {
        this.firewallApplications = value;
    }
    /**
     * Sets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @param value Value to set for the firewallBlockAllIncoming property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirewallBlockAllIncoming(@jakarta.annotation.Nullable final Boolean value) {
        this.firewallBlockAllIncoming = value;
    }
    /**
     * Sets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @param value Value to set for the firewallEnabled property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirewallEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.firewallEnabled = value;
    }
    /**
     * Sets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @param value Value to set for the firewallEnableStealthMode property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setFirewallEnableStealthMode(@jakarta.annotation.Nullable final Boolean value) {
        this.firewallEnableStealthMode = value;
    }
    /**
     * Sets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @param value Value to set for the gatekeeperAllowedAppSource property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGatekeeperAllowedAppSource(@jakarta.annotation.Nullable final MacOSGatekeeperAppSources value) {
        this.gatekeeperAllowedAppSource = value;
    }
    /**
     * Sets the gatekeeperBlockOverride property value. If set to true, the user override for Gatekeeper will be disabled.
     * @param value Value to set for the gatekeeperBlockOverride property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setGatekeeperBlockOverride(@jakarta.annotation.Nullable final Boolean value) {
        this.gatekeeperBlockOverride = value;
    }
}
