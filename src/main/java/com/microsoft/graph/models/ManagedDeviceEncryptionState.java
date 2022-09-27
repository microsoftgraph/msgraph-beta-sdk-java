package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Encryption report per device */
public class ManagedDeviceEncryptionState extends Entity implements Parsable {
    /** Advanced BitLocker State. Possible values are: success, noUserConsent, osVolumeUnprotected, osVolumeTpmRequired, osVolumeTpmOnlyRequired, osVolumeTpmPinRequired, osVolumeTpmStartupKeyRequired, osVolumeTpmPinStartupKeyRequired, osVolumeEncryptionMethodMismatch, recoveryKeyBackupFailed, fixedDriveNotEncrypted, fixedDriveEncryptionMethodMismatch, loggedOnUserNonAdmin, windowsRecoveryEnvironmentNotConfigured, tpmNotAvailable, tpmNotReady, networkError. */
    private AdvancedBitLockerState _advancedBitLockerStates;
    /** Device name */
    private String _deviceName;
    /** Device type. */
    private DeviceTypes _deviceType;
    /** The encryptionPolicySettingState property */
    private ComplianceStatus _encryptionPolicySettingState;
    /** Encryption readiness state */
    private EncryptionReadinessState _encryptionReadinessState;
    /** Encryption state */
    private EncryptionState _encryptionState;
    /** FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled. */
    private FileVaultState _fileVaultStates;
    /** Operating system version of the device */
    private String _osVersion;
    /** Policy Details */
    private java.util.List<EncryptionReportPolicyDetails> _policyDetails;
    /** Device TPM Version */
    private String _tpmSpecificationVersion;
    /** User name */
    private String _userPrincipalName;
    /**
     * Instantiates a new managedDeviceEncryptionState and sets the default values.
     * @return a void
     */
    public ManagedDeviceEncryptionState() {
        super();
        this.setOdataType("#microsoft.graph.managedDeviceEncryptionState");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managedDeviceEncryptionState
     */
    @javax.annotation.Nonnull
    public static ManagedDeviceEncryptionState createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceEncryptionState();
    }
    /**
     * Gets the advancedBitLockerStates property value. Advanced BitLocker State. Possible values are: success, noUserConsent, osVolumeUnprotected, osVolumeTpmRequired, osVolumeTpmOnlyRequired, osVolumeTpmPinRequired, osVolumeTpmStartupKeyRequired, osVolumeTpmPinStartupKeyRequired, osVolumeEncryptionMethodMismatch, recoveryKeyBackupFailed, fixedDriveNotEncrypted, fixedDriveEncryptionMethodMismatch, loggedOnUserNonAdmin, windowsRecoveryEnvironmentNotConfigured, tpmNotAvailable, tpmNotReady, networkError.
     * @return a advancedBitLockerState
     */
    @javax.annotation.Nullable
    public AdvancedBitLockerState getAdvancedBitLockerStates() {
        return this._advancedBitLockerStates;
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this._deviceName;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a deviceTypes
     */
    @javax.annotation.Nullable
    public DeviceTypes getDeviceType() {
        return this._deviceType;
    }
    /**
     * Gets the encryptionPolicySettingState property value. The encryptionPolicySettingState property
     * @return a complianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getEncryptionPolicySettingState() {
        return this._encryptionPolicySettingState;
    }
    /**
     * Gets the encryptionReadinessState property value. Encryption readiness state
     * @return a encryptionReadinessState
     */
    @javax.annotation.Nullable
    public EncryptionReadinessState getEncryptionReadinessState() {
        return this._encryptionReadinessState;
    }
    /**
     * Gets the encryptionState property value. Encryption state
     * @return a encryptionState
     */
    @javax.annotation.Nullable
    public EncryptionState getEncryptionState() {
        return this._encryptionState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagedDeviceEncryptionState currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("advancedBitLockerStates", (n) -> { currentObject.setAdvancedBitLockerStates(n.getEnumValue(AdvancedBitLockerState.class)); });
            this.put("deviceName", (n) -> { currentObject.setDeviceName(n.getStringValue()); });
            this.put("deviceType", (n) -> { currentObject.setDeviceType(n.getEnumValue(DeviceTypes.class)); });
            this.put("encryptionPolicySettingState", (n) -> { currentObject.setEncryptionPolicySettingState(n.getEnumValue(ComplianceStatus.class)); });
            this.put("encryptionReadinessState", (n) -> { currentObject.setEncryptionReadinessState(n.getEnumValue(EncryptionReadinessState.class)); });
            this.put("encryptionState", (n) -> { currentObject.setEncryptionState(n.getEnumValue(EncryptionState.class)); });
            this.put("fileVaultStates", (n) -> { currentObject.setFileVaultStates(n.getEnumValue(FileVaultState.class)); });
            this.put("osVersion", (n) -> { currentObject.setOsVersion(n.getStringValue()); });
            this.put("policyDetails", (n) -> { currentObject.setPolicyDetails(n.getCollectionOfObjectValues(EncryptionReportPolicyDetails::createFromDiscriminatorValue)); });
            this.put("tpmSpecificationVersion", (n) -> { currentObject.setTpmSpecificationVersion(n.getStringValue()); });
            this.put("userPrincipalName", (n) -> { currentObject.setUserPrincipalName(n.getStringValue()); });
        }};
    }
    /**
     * Gets the fileVaultStates property value. FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled.
     * @return a fileVaultState
     */
    @javax.annotation.Nullable
    public FileVaultState getFileVaultStates() {
        return this._fileVaultStates;
    }
    /**
     * Gets the osVersion property value. Operating system version of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this._osVersion;
    }
    /**
     * Gets the policyDetails property value. Policy Details
     * @return a encryptionReportPolicyDetails
     */
    @javax.annotation.Nullable
    public java.util.List<EncryptionReportPolicyDetails> getPolicyDetails() {
        return this._policyDetails;
    }
    /**
     * Gets the tpmSpecificationVersion property value. Device TPM Version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmSpecificationVersion() {
        return this._tpmSpecificationVersion;
    }
    /**
     * Gets the userPrincipalName property value. User name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this._userPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("advancedBitLockerStates", this.getAdvancedBitLockerStates());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeEnumValue("encryptionPolicySettingState", this.getEncryptionPolicySettingState());
        writer.writeEnumValue("encryptionReadinessState", this.getEncryptionReadinessState());
        writer.writeEnumValue("encryptionState", this.getEncryptionState());
        writer.writeEnumValue("fileVaultStates", this.getFileVaultStates());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeCollectionOfObjectValues("policyDetails", this.getPolicyDetails());
        writer.writeStringValue("tpmSpecificationVersion", this.getTpmSpecificationVersion());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the advancedBitLockerStates property value. Advanced BitLocker State. Possible values are: success, noUserConsent, osVolumeUnprotected, osVolumeTpmRequired, osVolumeTpmOnlyRequired, osVolumeTpmPinRequired, osVolumeTpmStartupKeyRequired, osVolumeTpmPinStartupKeyRequired, osVolumeEncryptionMethodMismatch, recoveryKeyBackupFailed, fixedDriveNotEncrypted, fixedDriveEncryptionMethodMismatch, loggedOnUserNonAdmin, windowsRecoveryEnvironmentNotConfigured, tpmNotAvailable, tpmNotReady, networkError.
     * @param value Value to set for the advancedBitLockerStates property.
     * @return a void
     */
    public void setAdvancedBitLockerStates(@javax.annotation.Nullable final AdvancedBitLockerState value) {
        this._advancedBitLockerStates = value;
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this._deviceName = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    public void setDeviceType(@javax.annotation.Nullable final DeviceTypes value) {
        this._deviceType = value;
    }
    /**
     * Sets the encryptionPolicySettingState property value. The encryptionPolicySettingState property
     * @param value Value to set for the encryptionPolicySettingState property.
     * @return a void
     */
    public void setEncryptionPolicySettingState(@javax.annotation.Nullable final ComplianceStatus value) {
        this._encryptionPolicySettingState = value;
    }
    /**
     * Sets the encryptionReadinessState property value. Encryption readiness state
     * @param value Value to set for the encryptionReadinessState property.
     * @return a void
     */
    public void setEncryptionReadinessState(@javax.annotation.Nullable final EncryptionReadinessState value) {
        this._encryptionReadinessState = value;
    }
    /**
     * Sets the encryptionState property value. Encryption state
     * @param value Value to set for the encryptionState property.
     * @return a void
     */
    public void setEncryptionState(@javax.annotation.Nullable final EncryptionState value) {
        this._encryptionState = value;
    }
    /**
     * Sets the fileVaultStates property value. FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled.
     * @param value Value to set for the fileVaultStates property.
     * @return a void
     */
    public void setFileVaultStates(@javax.annotation.Nullable final FileVaultState value) {
        this._fileVaultStates = value;
    }
    /**
     * Sets the osVersion property value. Operating system version of the device
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this._osVersion = value;
    }
    /**
     * Sets the policyDetails property value. Policy Details
     * @param value Value to set for the policyDetails property.
     * @return a void
     */
    public void setPolicyDetails(@javax.annotation.Nullable final java.util.List<EncryptionReportPolicyDetails> value) {
        this._policyDetails = value;
    }
    /**
     * Sets the tpmSpecificationVersion property value. Device TPM Version
     * @param value Value to set for the tpmSpecificationVersion property.
     * @return a void
     */
    public void setTpmSpecificationVersion(@javax.annotation.Nullable final String value) {
        this._tpmSpecificationVersion = value;
    }
    /**
     * Sets the userPrincipalName property value. User name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this._userPrincipalName = value;
    }
}
