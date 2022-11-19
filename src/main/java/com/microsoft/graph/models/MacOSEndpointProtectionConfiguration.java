package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MacOSEndpointProtectionConfiguration extends DeviceConfiguration implements Parsable {
    /** Possible values of a property */
    private Enablement _advancedThreatProtectionAutomaticSampleSubmission;
    /** Possible values of a property */
    private Enablement _advancedThreatProtectionCloudDelivered;
    /** Possible values of a property */
    private Enablement _advancedThreatProtectionDiagnosticDataCollection;
    /** A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS. */
    private java.util.List<String> _advancedThreatProtectionExcludedExtensions;
    /** A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS. */
    private java.util.List<String> _advancedThreatProtectionExcludedFiles;
    /** A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS. */
    private java.util.List<String> _advancedThreatProtectionExcludedFolders;
    /** A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS. */
    private java.util.List<String> _advancedThreatProtectionExcludedProcesses;
    /** Possible values of a property */
    private Enablement _advancedThreatProtectionRealTime;
    /** Optional. If set to true, the user can defer the enabling of FileVault until they sign out. */
    private Boolean _fileVaultAllowDeferralUntilSignOut;
    /** Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out. */
    private Boolean _fileVaultDisablePromptAtSignOut;
    /** Whether FileVault should be enabled or not. */
    private Boolean _fileVaultEnabled;
    /** Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands. */
    private Boolean _fileVaultHidePersonalRecoveryKey;
    /** Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key. */
    private byte[] _fileVaultInstitutionalRecoveryKeyCertificate;
    /** File name of the institutional recovery key certificate to display in UI. (.der). */
    private String _fileVaultInstitutionalRecoveryKeyCertificateFileName;
    /** Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature. */
    private Integer _fileVaultNumberOfTimesUserCanIgnore;
    /** Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key. */
    private String _fileVaultPersonalRecoveryKeyHelpMessage;
    /** Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months. */
    private Integer _fileVaultPersonalRecoveryKeyRotationInMonths;
    /** Recovery key types for macOS FileVault */
    private MacOSFileVaultRecoveryKeyTypes _fileVaultSelectedRecoveryKeyTypes;
    /** List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements. */
    private java.util.List<MacOSFirewallApplication> _firewallApplications;
    /** Corresponds to the 'Block all incoming connections' option. */
    private Boolean _firewallBlockAllIncoming;
    /** Whether the firewall should be enabled or not. */
    private Boolean _firewallEnabled;
    /** Corresponds to 'Enable stealth mode.' */
    private Boolean _firewallEnableStealthMode;
    /** App source options for macOS Gatekeeper. */
    private MacOSGatekeeperAppSources _gatekeeperAllowedAppSource;
    /** If set to true, the user override for Gatekeeper will be disabled. */
    private Boolean _gatekeeperBlockOverride;
    /**
     * Instantiates a new MacOSEndpointProtectionConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MacOSEndpointProtectionConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.macOSEndpointProtectionConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MacOSEndpointProtectionConfiguration
     */
    @javax.annotation.Nonnull
    public static MacOSEndpointProtectionConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSEndpointProtectionConfiguration();
    }
    /**
     * Gets the advancedThreatProtectionAutomaticSampleSubmission property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAdvancedThreatProtectionAutomaticSampleSubmission() {
        return this._advancedThreatProtectionAutomaticSampleSubmission;
    }
    /**
     * Gets the advancedThreatProtectionCloudDelivered property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAdvancedThreatProtectionCloudDelivered() {
        return this._advancedThreatProtectionCloudDelivered;
    }
    /**
     * Gets the advancedThreatProtectionDiagnosticDataCollection property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAdvancedThreatProtectionDiagnosticDataCollection() {
        return this._advancedThreatProtectionDiagnosticDataCollection;
    }
    /**
     * Gets the advancedThreatProtectionExcludedExtensions property value. A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedExtensions() {
        return this._advancedThreatProtectionExcludedExtensions;
    }
    /**
     * Gets the advancedThreatProtectionExcludedFiles property value. A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedFiles() {
        return this._advancedThreatProtectionExcludedFiles;
    }
    /**
     * Gets the advancedThreatProtectionExcludedFolders property value. A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedFolders() {
        return this._advancedThreatProtectionExcludedFolders;
    }
    /**
     * Gets the advancedThreatProtectionExcludedProcesses property value. A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getAdvancedThreatProtectionExcludedProcesses() {
        return this._advancedThreatProtectionExcludedProcesses;
    }
    /**
     * Gets the advancedThreatProtectionRealTime property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAdvancedThreatProtectionRealTime() {
        return this._advancedThreatProtectionRealTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MacOSEndpointProtectionConfiguration currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedThreatProtectionAutomaticSampleSubmission", (n) -> { currentObject.setAdvancedThreatProtectionAutomaticSampleSubmission(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("advancedThreatProtectionCloudDelivered", (n) -> { currentObject.setAdvancedThreatProtectionCloudDelivered(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("advancedThreatProtectionDiagnosticDataCollection", (n) -> { currentObject.setAdvancedThreatProtectionDiagnosticDataCollection(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedExtensions", (n) -> { currentObject.setAdvancedThreatProtectionExcludedExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedFiles", (n) -> { currentObject.setAdvancedThreatProtectionExcludedFiles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedFolders", (n) -> { currentObject.setAdvancedThreatProtectionExcludedFolders(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionExcludedProcesses", (n) -> { currentObject.setAdvancedThreatProtectionExcludedProcesses(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("advancedThreatProtectionRealTime", (n) -> { currentObject.setAdvancedThreatProtectionRealTime(n.getEnumValue(Enablement.class)); });
        deserializerMap.put("fileVaultAllowDeferralUntilSignOut", (n) -> { currentObject.setFileVaultAllowDeferralUntilSignOut(n.getBooleanValue()); });
        deserializerMap.put("fileVaultDisablePromptAtSignOut", (n) -> { currentObject.setFileVaultDisablePromptAtSignOut(n.getBooleanValue()); });
        deserializerMap.put("fileVaultEnabled", (n) -> { currentObject.setFileVaultEnabled(n.getBooleanValue()); });
        deserializerMap.put("fileVaultHidePersonalRecoveryKey", (n) -> { currentObject.setFileVaultHidePersonalRecoveryKey(n.getBooleanValue()); });
        deserializerMap.put("fileVaultInstitutionalRecoveryKeyCertificate", (n) -> { currentObject.setFileVaultInstitutionalRecoveryKeyCertificate(n.getByteArrayValue()); });
        deserializerMap.put("fileVaultInstitutionalRecoveryKeyCertificateFileName", (n) -> { currentObject.setFileVaultInstitutionalRecoveryKeyCertificateFileName(n.getStringValue()); });
        deserializerMap.put("fileVaultNumberOfTimesUserCanIgnore", (n) -> { currentObject.setFileVaultNumberOfTimesUserCanIgnore(n.getIntegerValue()); });
        deserializerMap.put("fileVaultPersonalRecoveryKeyHelpMessage", (n) -> { currentObject.setFileVaultPersonalRecoveryKeyHelpMessage(n.getStringValue()); });
        deserializerMap.put("fileVaultPersonalRecoveryKeyRotationInMonths", (n) -> { currentObject.setFileVaultPersonalRecoveryKeyRotationInMonths(n.getIntegerValue()); });
        deserializerMap.put("fileVaultSelectedRecoveryKeyTypes", (n) -> { currentObject.setFileVaultSelectedRecoveryKeyTypes(n.getEnumValue(MacOSFileVaultRecoveryKeyTypes.class)); });
        deserializerMap.put("firewallApplications", (n) -> { currentObject.setFirewallApplications(n.getCollectionOfObjectValues(MacOSFirewallApplication::createFromDiscriminatorValue)); });
        deserializerMap.put("firewallBlockAllIncoming", (n) -> { currentObject.setFirewallBlockAllIncoming(n.getBooleanValue()); });
        deserializerMap.put("firewallEnabled", (n) -> { currentObject.setFirewallEnabled(n.getBooleanValue()); });
        deserializerMap.put("firewallEnableStealthMode", (n) -> { currentObject.setFirewallEnableStealthMode(n.getBooleanValue()); });
        deserializerMap.put("gatekeeperAllowedAppSource", (n) -> { currentObject.setGatekeeperAllowedAppSource(n.getEnumValue(MacOSGatekeeperAppSources.class)); });
        deserializerMap.put("gatekeeperBlockOverride", (n) -> { currentObject.setGatekeeperBlockOverride(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileVaultAllowDeferralUntilSignOut property value. Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFileVaultAllowDeferralUntilSignOut() {
        return this._fileVaultAllowDeferralUntilSignOut;
    }
    /**
     * Gets the fileVaultDisablePromptAtSignOut property value. Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFileVaultDisablePromptAtSignOut() {
        return this._fileVaultDisablePromptAtSignOut;
    }
    /**
     * Gets the fileVaultEnabled property value. Whether FileVault should be enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFileVaultEnabled() {
        return this._fileVaultEnabled;
    }
    /**
     * Gets the fileVaultHidePersonalRecoveryKey property value. Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFileVaultHidePersonalRecoveryKey() {
        return this._fileVaultHidePersonalRecoveryKey;
    }
    /**
     * Gets the fileVaultInstitutionalRecoveryKeyCertificate property value. Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     * @return a binary
     */
    @javax.annotation.Nullable
    public byte[] getFileVaultInstitutionalRecoveryKeyCertificate() {
        return this._fileVaultInstitutionalRecoveryKeyCertificate;
    }
    /**
     * Gets the fileVaultInstitutionalRecoveryKeyCertificateFileName property value. File name of the institutional recovery key certificate to display in UI. (.der).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileVaultInstitutionalRecoveryKeyCertificateFileName() {
        return this._fileVaultInstitutionalRecoveryKeyCertificateFileName;
    }
    /**
     * Gets the fileVaultNumberOfTimesUserCanIgnore property value. Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFileVaultNumberOfTimesUserCanIgnore() {
        return this._fileVaultNumberOfTimesUserCanIgnore;
    }
    /**
     * Gets the fileVaultPersonalRecoveryKeyHelpMessage property value. Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFileVaultPersonalRecoveryKeyHelpMessage() {
        return this._fileVaultPersonalRecoveryKeyHelpMessage;
    }
    /**
     * Gets the fileVaultPersonalRecoveryKeyRotationInMonths property value. Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFileVaultPersonalRecoveryKeyRotationInMonths() {
        return this._fileVaultPersonalRecoveryKeyRotationInMonths;
    }
    /**
     * Gets the fileVaultSelectedRecoveryKeyTypes property value. Recovery key types for macOS FileVault
     * @return a macOSFileVaultRecoveryKeyTypes
     */
    @javax.annotation.Nullable
    public MacOSFileVaultRecoveryKeyTypes getFileVaultSelectedRecoveryKeyTypes() {
        return this._fileVaultSelectedRecoveryKeyTypes;
    }
    /**
     * Gets the firewallApplications property value. List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     * @return a macOSFirewallApplication
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSFirewallApplication> getFirewallApplications() {
        return this._firewallApplications;
    }
    /**
     * Gets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallBlockAllIncoming() {
        return this._firewallBlockAllIncoming;
    }
    /**
     * Gets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallEnabled() {
        return this._firewallEnabled;
    }
    /**
     * Gets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getFirewallEnableStealthMode() {
        return this._firewallEnableStealthMode;
    }
    /**
     * Gets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @return a macOSGatekeeperAppSources
     */
    @javax.annotation.Nullable
    public MacOSGatekeeperAppSources getGatekeeperAllowedAppSource() {
        return this._gatekeeperAllowedAppSource;
    }
    /**
     * Gets the gatekeeperBlockOverride property value. If set to true, the user override for Gatekeeper will be disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getGatekeeperBlockOverride() {
        return this._gatekeeperBlockOverride;
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
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionAutomaticSampleSubmission(@javax.annotation.Nullable final Enablement value) {
        this._advancedThreatProtectionAutomaticSampleSubmission = value;
    }
    /**
     * Sets the advancedThreatProtectionCloudDelivered property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionCloudDelivered property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionCloudDelivered(@javax.annotation.Nullable final Enablement value) {
        this._advancedThreatProtectionCloudDelivered = value;
    }
    /**
     * Sets the advancedThreatProtectionDiagnosticDataCollection property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionDiagnosticDataCollection property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionDiagnosticDataCollection(@javax.annotation.Nullable final Enablement value) {
        this._advancedThreatProtectionDiagnosticDataCollection = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedExtensions property value. A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedExtensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedExtensions(@javax.annotation.Nullable final java.util.List<String> value) {
        this._advancedThreatProtectionExcludedExtensions = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedFiles property value. A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedFiles property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedFiles(@javax.annotation.Nullable final java.util.List<String> value) {
        this._advancedThreatProtectionExcludedFiles = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedFolders property value. A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedFolders property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedFolders(@javax.annotation.Nullable final java.util.List<String> value) {
        this._advancedThreatProtectionExcludedFolders = value;
    }
    /**
     * Sets the advancedThreatProtectionExcludedProcesses property value. A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.
     * @param value Value to set for the advancedThreatProtectionExcludedProcesses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionExcludedProcesses(@javax.annotation.Nullable final java.util.List<String> value) {
        this._advancedThreatProtectionExcludedProcesses = value;
    }
    /**
     * Sets the advancedThreatProtectionRealTime property value. Possible values of a property
     * @param value Value to set for the advancedThreatProtectionRealTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdvancedThreatProtectionRealTime(@javax.annotation.Nullable final Enablement value) {
        this._advancedThreatProtectionRealTime = value;
    }
    /**
     * Sets the fileVaultAllowDeferralUntilSignOut property value. Optional. If set to true, the user can defer the enabling of FileVault until they sign out.
     * @param value Value to set for the fileVaultAllowDeferralUntilSignOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultAllowDeferralUntilSignOut(@javax.annotation.Nullable final Boolean value) {
        this._fileVaultAllowDeferralUntilSignOut = value;
    }
    /**
     * Sets the fileVaultDisablePromptAtSignOut property value. Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.
     * @param value Value to set for the fileVaultDisablePromptAtSignOut property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultDisablePromptAtSignOut(@javax.annotation.Nullable final Boolean value) {
        this._fileVaultDisablePromptAtSignOut = value;
    }
    /**
     * Sets the fileVaultEnabled property value. Whether FileVault should be enabled or not.
     * @param value Value to set for the fileVaultEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultEnabled(@javax.annotation.Nullable final Boolean value) {
        this._fileVaultEnabled = value;
    }
    /**
     * Sets the fileVaultHidePersonalRecoveryKey property value. Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.
     * @param value Value to set for the fileVaultHidePersonalRecoveryKey property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultHidePersonalRecoveryKey(@javax.annotation.Nullable final Boolean value) {
        this._fileVaultHidePersonalRecoveryKey = value;
    }
    /**
     * Sets the fileVaultInstitutionalRecoveryKeyCertificate property value. Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.
     * @param value Value to set for the fileVaultInstitutionalRecoveryKeyCertificate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultInstitutionalRecoveryKeyCertificate(@javax.annotation.Nullable final byte[] value) {
        this._fileVaultInstitutionalRecoveryKeyCertificate = value;
    }
    /**
     * Sets the fileVaultInstitutionalRecoveryKeyCertificateFileName property value. File name of the institutional recovery key certificate to display in UI. (.der).
     * @param value Value to set for the fileVaultInstitutionalRecoveryKeyCertificateFileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultInstitutionalRecoveryKeyCertificateFileName(@javax.annotation.Nullable final String value) {
        this._fileVaultInstitutionalRecoveryKeyCertificateFileName = value;
    }
    /**
     * Sets the fileVaultNumberOfTimesUserCanIgnore property value. Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.
     * @param value Value to set for the fileVaultNumberOfTimesUserCanIgnore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultNumberOfTimesUserCanIgnore(@javax.annotation.Nullable final Integer value) {
        this._fileVaultNumberOfTimesUserCanIgnore = value;
    }
    /**
     * Sets the fileVaultPersonalRecoveryKeyHelpMessage property value. Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.
     * @param value Value to set for the fileVaultPersonalRecoveryKeyHelpMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultPersonalRecoveryKeyHelpMessage(@javax.annotation.Nullable final String value) {
        this._fileVaultPersonalRecoveryKeyHelpMessage = value;
    }
    /**
     * Sets the fileVaultPersonalRecoveryKeyRotationInMonths property value. Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.
     * @param value Value to set for the fileVaultPersonalRecoveryKeyRotationInMonths property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultPersonalRecoveryKeyRotationInMonths(@javax.annotation.Nullable final Integer value) {
        this._fileVaultPersonalRecoveryKeyRotationInMonths = value;
    }
    /**
     * Sets the fileVaultSelectedRecoveryKeyTypes property value. Recovery key types for macOS FileVault
     * @param value Value to set for the fileVaultSelectedRecoveryKeyTypes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultSelectedRecoveryKeyTypes(@javax.annotation.Nullable final MacOSFileVaultRecoveryKeyTypes value) {
        this._fileVaultSelectedRecoveryKeyTypes = value;
    }
    /**
     * Sets the firewallApplications property value. List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the firewallApplications property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallApplications(@javax.annotation.Nullable final java.util.List<MacOSFirewallApplication> value) {
        this._firewallApplications = value;
    }
    /**
     * Sets the firewallBlockAllIncoming property value. Corresponds to the 'Block all incoming connections' option.
     * @param value Value to set for the firewallBlockAllIncoming property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallBlockAllIncoming(@javax.annotation.Nullable final Boolean value) {
        this._firewallBlockAllIncoming = value;
    }
    /**
     * Sets the firewallEnabled property value. Whether the firewall should be enabled or not.
     * @param value Value to set for the firewallEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallEnabled(@javax.annotation.Nullable final Boolean value) {
        this._firewallEnabled = value;
    }
    /**
     * Sets the firewallEnableStealthMode property value. Corresponds to 'Enable stealth mode.'
     * @param value Value to set for the firewallEnableStealthMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirewallEnableStealthMode(@javax.annotation.Nullable final Boolean value) {
        this._firewallEnableStealthMode = value;
    }
    /**
     * Sets the gatekeeperAllowedAppSource property value. App source options for macOS Gatekeeper.
     * @param value Value to set for the gatekeeperAllowedAppSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGatekeeperAllowedAppSource(@javax.annotation.Nullable final MacOSGatekeeperAppSources value) {
        this._gatekeeperAllowedAppSource = value;
    }
    /**
     * Sets the gatekeeperBlockOverride property value. If set to true, the user override for Gatekeeper will be disabled.
     * @param value Value to set for the gatekeeperBlockOverride property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGatekeeperBlockOverride(@javax.annotation.Nullable final Boolean value) {
        this._gatekeeperBlockOverride = value;
    }
}
