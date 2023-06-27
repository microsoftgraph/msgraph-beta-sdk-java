package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ManagedDeviceEncryptionState extends Entity implements Parsable {
    /**
     * Advanced BitLocker State. Possible values are: success, noUserConsent, osVolumeUnprotected, osVolumeTpmRequired, osVolumeTpmOnlyRequired, osVolumeTpmPinRequired, osVolumeTpmStartupKeyRequired, osVolumeTpmPinStartupKeyRequired, osVolumeEncryptionMethodMismatch, recoveryKeyBackupFailed, fixedDriveNotEncrypted, fixedDriveEncryptionMethodMismatch, loggedOnUserNonAdmin, windowsRecoveryEnvironmentNotConfigured, tpmNotAvailable, tpmNotReady, networkError.
     */
    private AdvancedBitLockerState advancedBitLockerStates;
    /**
     * Device name
     */
    private String deviceName;
    /**
     * Device type.
     */
    private DeviceTypes deviceType;
    /**
     * The encryptionPolicySettingState property
     */
    private ComplianceStatus encryptionPolicySettingState;
    /**
     * Encryption readiness state
     */
    private EncryptionReadinessState encryptionReadinessState;
    /**
     * Encryption state
     */
    private EncryptionState encryptionState;
    /**
     * FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled.
     */
    private FileVaultState fileVaultStates;
    /**
     * Operating system version of the device
     */
    private String osVersion;
    /**
     * Policy Details
     */
    private java.util.List<EncryptionReportPolicyDetails> policyDetails;
    /**
     * Device TPM Version
     */
    private String tpmSpecificationVersion;
    /**
     * User name
     */
    private String userPrincipalName;
    /**
     * Instantiates a new ManagedDeviceEncryptionState and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagedDeviceEncryptionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceEncryptionState
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
        return this.advancedBitLockerStates;
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a DeviceTypes
     */
    @javax.annotation.Nullable
    public DeviceTypes getDeviceType() {
        return this.deviceType;
    }
    /**
     * Gets the encryptionPolicySettingState property value. The encryptionPolicySettingState property
     * @return a ComplianceStatus
     */
    @javax.annotation.Nullable
    public ComplianceStatus getEncryptionPolicySettingState() {
        return this.encryptionPolicySettingState;
    }
    /**
     * Gets the encryptionReadinessState property value. Encryption readiness state
     * @return a EncryptionReadinessState
     */
    @javax.annotation.Nullable
    public EncryptionReadinessState getEncryptionReadinessState() {
        return this.encryptionReadinessState;
    }
    /**
     * Gets the encryptionState property value. Encryption state
     * @return a EncryptionState
     */
    @javax.annotation.Nullable
    public EncryptionState getEncryptionState() {
        return this.encryptionState;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedBitLockerStates", (n) -> { this.setAdvancedBitLockerStates(n.getEnumValue(AdvancedBitLockerState.class)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(DeviceTypes.class)); });
        deserializerMap.put("encryptionPolicySettingState", (n) -> { this.setEncryptionPolicySettingState(n.getEnumValue(ComplianceStatus.class)); });
        deserializerMap.put("encryptionReadinessState", (n) -> { this.setEncryptionReadinessState(n.getEnumValue(EncryptionReadinessState.class)); });
        deserializerMap.put("encryptionState", (n) -> { this.setEncryptionState(n.getEnumValue(EncryptionState.class)); });
        deserializerMap.put("fileVaultStates", (n) -> { this.setFileVaultStates(n.getEnumValue(FileVaultState.class)); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("policyDetails", (n) -> { this.setPolicyDetails(n.getCollectionOfObjectValues(EncryptionReportPolicyDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("tpmSpecificationVersion", (n) -> { this.setTpmSpecificationVersion(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileVaultStates property value. FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled.
     * @return a fileVaultState
     */
    @javax.annotation.Nullable
    public FileVaultState getFileVaultStates() {
        return this.fileVaultStates;
    }
    /**
     * Gets the osVersion property value. Operating system version of the device
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOsVersion() {
        return this.osVersion;
    }
    /**
     * Gets the policyDetails property value. Policy Details
     * @return a encryptionReportPolicyDetails
     */
    @javax.annotation.Nullable
    public java.util.List<EncryptionReportPolicyDetails> getPolicyDetails() {
        return this.policyDetails;
    }
    /**
     * Gets the tpmSpecificationVersion property value. Device TPM Version
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTpmSpecificationVersion() {
        return this.tpmSpecificationVersion;
    }
    /**
     * Gets the userPrincipalName property value. User name
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserPrincipalName() {
        return this.userPrincipalName;
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
    @javax.annotation.Nonnull
    public void setAdvancedBitLockerStates(@javax.annotation.Nullable final AdvancedBitLockerState value) {
        this.advancedBitLockerStates = value;
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceName(@javax.annotation.Nullable final String value) {
        this.deviceName = value;
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceType(@javax.annotation.Nullable final DeviceTypes value) {
        this.deviceType = value;
    }
    /**
     * Sets the encryptionPolicySettingState property value. The encryptionPolicySettingState property
     * @param value Value to set for the encryptionPolicySettingState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptionPolicySettingState(@javax.annotation.Nullable final ComplianceStatus value) {
        this.encryptionPolicySettingState = value;
    }
    /**
     * Sets the encryptionReadinessState property value. Encryption readiness state
     * @param value Value to set for the encryptionReadinessState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptionReadinessState(@javax.annotation.Nullable final EncryptionReadinessState value) {
        this.encryptionReadinessState = value;
    }
    /**
     * Sets the encryptionState property value. Encryption state
     * @param value Value to set for the encryptionState property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEncryptionState(@javax.annotation.Nullable final EncryptionState value) {
        this.encryptionState = value;
    }
    /**
     * Sets the fileVaultStates property value. FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled.
     * @param value Value to set for the fileVaultStates property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFileVaultStates(@javax.annotation.Nullable final FileVaultState value) {
        this.fileVaultStates = value;
    }
    /**
     * Sets the osVersion property value. Operating system version of the device
     * @param value Value to set for the osVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOsVersion(@javax.annotation.Nullable final String value) {
        this.osVersion = value;
    }
    /**
     * Sets the policyDetails property value. Policy Details
     * @param value Value to set for the policyDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyDetails(@javax.annotation.Nullable final java.util.List<EncryptionReportPolicyDetails> value) {
        this.policyDetails = value;
    }
    /**
     * Sets the tpmSpecificationVersion property value. Device TPM Version
     * @param value Value to set for the tpmSpecificationVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTpmSpecificationVersion(@javax.annotation.Nullable final String value) {
        this.tpmSpecificationVersion = value;
    }
    /**
     * Sets the userPrincipalName property value. User name
     * @param value Value to set for the userPrincipalName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserPrincipalName(@javax.annotation.Nullable final String value) {
        this.userPrincipalName = value;
    }
}
