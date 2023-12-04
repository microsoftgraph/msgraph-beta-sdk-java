package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Encryption report per device
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ManagedDeviceEncryptionState extends Entity implements Parsable {
    /**
     * Instantiates a new ManagedDeviceEncryptionState and sets the default values.
     */
    public ManagedDeviceEncryptionState() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ManagedDeviceEncryptionState
     */
    @jakarta.annotation.Nonnull
    public static ManagedDeviceEncryptionState createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagedDeviceEncryptionState();
    }
    /**
     * Gets the advancedBitLockerStates property value. Advanced BitLocker State. Possible values are: success, noUserConsent, osVolumeUnprotected, osVolumeTpmRequired, osVolumeTpmOnlyRequired, osVolumeTpmPinRequired, osVolumeTpmStartupKeyRequired, osVolumeTpmPinStartupKeyRequired, osVolumeEncryptionMethodMismatch, recoveryKeyBackupFailed, fixedDriveNotEncrypted, fixedDriveEncryptionMethodMismatch, loggedOnUserNonAdmin, windowsRecoveryEnvironmentNotConfigured, tpmNotAvailable, tpmNotReady, networkError.
     * @return a EnumSet<AdvancedBitLockerState>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AdvancedBitLockerState> getAdvancedBitLockerStates() {
        return this.backingStore.get("advancedBitLockerStates");
    }
    /**
     * Gets the deviceName property value. Device name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceName() {
        return this.backingStore.get("deviceName");
    }
    /**
     * Gets the deviceType property value. Device type.
     * @return a DeviceTypes
     */
    @jakarta.annotation.Nullable
    public DeviceTypes getDeviceType() {
        return this.backingStore.get("deviceType");
    }
    /**
     * Gets the encryptionPolicySettingState property value. The encryptionPolicySettingState property
     * @return a ComplianceStatus
     */
    @jakarta.annotation.Nullable
    public ComplianceStatus getEncryptionPolicySettingState() {
        return this.backingStore.get("encryptionPolicySettingState");
    }
    /**
     * Gets the encryptionReadinessState property value. Encryption readiness state
     * @return a EncryptionReadinessState
     */
    @jakarta.annotation.Nullable
    public EncryptionReadinessState getEncryptionReadinessState() {
        return this.backingStore.get("encryptionReadinessState");
    }
    /**
     * Gets the encryptionState property value. Encryption state
     * @return a EncryptionState
     */
    @jakarta.annotation.Nullable
    public EncryptionState getEncryptionState() {
        return this.backingStore.get("encryptionState");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("advancedBitLockerStates", (n) -> { this.setAdvancedBitLockerStates(n.getEnumSetValue(AdvancedBitLockerState::forValue)); });
        deserializerMap.put("deviceName", (n) -> { this.setDeviceName(n.getStringValue()); });
        deserializerMap.put("deviceType", (n) -> { this.setDeviceType(n.getEnumValue(DeviceTypes::forValue)); });
        deserializerMap.put("encryptionPolicySettingState", (n) -> { this.setEncryptionPolicySettingState(n.getEnumValue(ComplianceStatus::forValue)); });
        deserializerMap.put("encryptionReadinessState", (n) -> { this.setEncryptionReadinessState(n.getEnumValue(EncryptionReadinessState::forValue)); });
        deserializerMap.put("encryptionState", (n) -> { this.setEncryptionState(n.getEnumValue(EncryptionState::forValue)); });
        deserializerMap.put("fileVaultStates", (n) -> { this.setFileVaultStates(n.getEnumSetValue(FileVaultState::forValue)); });
        deserializerMap.put("osVersion", (n) -> { this.setOsVersion(n.getStringValue()); });
        deserializerMap.put("policyDetails", (n) -> { this.setPolicyDetails(n.getCollectionOfObjectValues(EncryptionReportPolicyDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("tpmSpecificationVersion", (n) -> { this.setTpmSpecificationVersion(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fileVaultStates property value. FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled.
     * @return a EnumSet<FileVaultState>
     */
    @jakarta.annotation.Nullable
    public EnumSet<FileVaultState> getFileVaultStates() {
        return this.backingStore.get("fileVaultStates");
    }
    /**
     * Gets the osVersion property value. Operating system version of the device
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOsVersion() {
        return this.backingStore.get("osVersion");
    }
    /**
     * Gets the policyDetails property value. Policy Details
     * @return a java.util.List<EncryptionReportPolicyDetails>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EncryptionReportPolicyDetails> getPolicyDetails() {
        return this.backingStore.get("policyDetails");
    }
    /**
     * Gets the tpmSpecificationVersion property value. Device TPM Version
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTpmSpecificationVersion() {
        return this.backingStore.get("tpmSpecificationVersion");
    }
    /**
     * Gets the userPrincipalName property value. User name
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("advancedBitLockerStates", this.getAdvancedBitLockerStates());
        writer.writeStringValue("deviceName", this.getDeviceName());
        writer.writeEnumValue("deviceType", this.getDeviceType());
        writer.writeEnumValue("encryptionPolicySettingState", this.getEncryptionPolicySettingState());
        writer.writeEnumValue("encryptionReadinessState", this.getEncryptionReadinessState());
        writer.writeEnumValue("encryptionState", this.getEncryptionState());
        writer.writeEnumSetValue("fileVaultStates", this.getFileVaultStates());
        writer.writeStringValue("osVersion", this.getOsVersion());
        writer.writeCollectionOfObjectValues("policyDetails", this.getPolicyDetails());
        writer.writeStringValue("tpmSpecificationVersion", this.getTpmSpecificationVersion());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the advancedBitLockerStates property value. Advanced BitLocker State. Possible values are: success, noUserConsent, osVolumeUnprotected, osVolumeTpmRequired, osVolumeTpmOnlyRequired, osVolumeTpmPinRequired, osVolumeTpmStartupKeyRequired, osVolumeTpmPinStartupKeyRequired, osVolumeEncryptionMethodMismatch, recoveryKeyBackupFailed, fixedDriveNotEncrypted, fixedDriveEncryptionMethodMismatch, loggedOnUserNonAdmin, windowsRecoveryEnvironmentNotConfigured, tpmNotAvailable, tpmNotReady, networkError.
     * @param value Value to set for the advancedBitLockerStates property.
     */
    public void setAdvancedBitLockerStates(@jakarta.annotation.Nullable final EnumSet<AdvancedBitLockerState> value) {
        this.backingStore.set("advancedBitLockerStates", value);
    }
    /**
     * Sets the deviceName property value. Device name
     * @param value Value to set for the deviceName property.
     */
    public void setDeviceName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceName", value);
    }
    /**
     * Sets the deviceType property value. Device type.
     * @param value Value to set for the deviceType property.
     */
    public void setDeviceType(@jakarta.annotation.Nullable final DeviceTypes value) {
        this.backingStore.set("deviceType", value);
    }
    /**
     * Sets the encryptionPolicySettingState property value. The encryptionPolicySettingState property
     * @param value Value to set for the encryptionPolicySettingState property.
     */
    public void setEncryptionPolicySettingState(@jakarta.annotation.Nullable final ComplianceStatus value) {
        this.backingStore.set("encryptionPolicySettingState", value);
    }
    /**
     * Sets the encryptionReadinessState property value. Encryption readiness state
     * @param value Value to set for the encryptionReadinessState property.
     */
    public void setEncryptionReadinessState(@jakarta.annotation.Nullable final EncryptionReadinessState value) {
        this.backingStore.set("encryptionReadinessState", value);
    }
    /**
     * Sets the encryptionState property value. Encryption state
     * @param value Value to set for the encryptionState property.
     */
    public void setEncryptionState(@jakarta.annotation.Nullable final EncryptionState value) {
        this.backingStore.set("encryptionState", value);
    }
    /**
     * Sets the fileVaultStates property value. FileVault State. Possible values are: success, driveEncryptedByUser, userDeferredEncryption, escrowNotEnabled.
     * @param value Value to set for the fileVaultStates property.
     */
    public void setFileVaultStates(@jakarta.annotation.Nullable final EnumSet<FileVaultState> value) {
        this.backingStore.set("fileVaultStates", value);
    }
    /**
     * Sets the osVersion property value. Operating system version of the device
     * @param value Value to set for the osVersion property.
     */
    public void setOsVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("osVersion", value);
    }
    /**
     * Sets the policyDetails property value. Policy Details
     * @param value Value to set for the policyDetails property.
     */
    public void setPolicyDetails(@jakarta.annotation.Nullable final java.util.List<EncryptionReportPolicyDetails> value) {
        this.backingStore.set("policyDetails", value);
    }
    /**
     * Sets the tpmSpecificationVersion property value. Device TPM Version
     * @param value Value to set for the tpmSpecificationVersion property.
     */
    public void setTpmSpecificationVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("tpmSpecificationVersion", value);
    }
    /**
     * Sets the userPrincipalName property value. User name
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}
