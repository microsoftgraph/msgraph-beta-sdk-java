package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AdvancedBitLockerState implements ValuedEnum {
    /** Advanced BitLocker State Success */
    Success("success"),
    /** User never gave consent for Encryption */
    NoUserConsent("noUserConsent"),
    /** Un-protected OS Volume was detected */
    OsVolumeUnprotected("osVolumeUnprotected"),
    /** TPM not used for protection of OS volume, but is required by policy */
    OsVolumeTpmRequired("osVolumeTpmRequired"),
    /** TPM only protection not used for OS volume, but is required by policy */
    OsVolumeTpmOnlyRequired("osVolumeTpmOnlyRequired"),
    /** TPM+PIN protection not used for OS volume, but is required by policy */
    OsVolumeTpmPinRequired("osVolumeTpmPinRequired"),
    /** TPM+Startup Key protection not used for OS volume, but is required by policy */
    OsVolumeTpmStartupKeyRequired("osVolumeTpmStartupKeyRequired"),
    /** TPM+PIN+Startup Key not used for OS volume, but is required by policy */
    OsVolumeTpmPinStartupKeyRequired("osVolumeTpmPinStartupKeyRequired"),
    /** Encryption method of OS Volume is different than that set by policy */
    OsVolumeEncryptionMethodMismatch("osVolumeEncryptionMethodMismatch"),
    /** Recovery key backup failed */
    RecoveryKeyBackupFailed("recoveryKeyBackupFailed"),
    /** Fixed Drive not encrypted */
    FixedDriveNotEncrypted("fixedDriveNotEncrypted"),
    /** Encryption method of Fixed Drive is different than that set by policy */
    FixedDriveEncryptionMethodMismatch("fixedDriveEncryptionMethodMismatch"),
    /** Logged on user is non-admin. This requires “AllowStandardUserEncryption” policy set to 1 */
    LoggedOnUserNonAdmin("loggedOnUserNonAdmin"),
    /** WinRE is not configured */
    WindowsRecoveryEnvironmentNotConfigured("windowsRecoveryEnvironmentNotConfigured"),
    /** TPM is not available for BitLocker. This means TPM is not present, or TPM unavailable registry override is set or host OS is on portable/rome-able drive */
    TpmNotAvailable("tpmNotAvailable"),
    /** TPM is not ready for BitLocker */
    TpmNotReady("tpmNotReady"),
    /** Network not available. This is required for recovery key backup. This is reported for Drive Encryption capable devices */
    NetworkError("networkError");
    public final String value;
    AdvancedBitLockerState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AdvancedBitLockerState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "noUserConsent": return NoUserConsent;
            case "osVolumeUnprotected": return OsVolumeUnprotected;
            case "osVolumeTpmRequired": return OsVolumeTpmRequired;
            case "osVolumeTpmOnlyRequired": return OsVolumeTpmOnlyRequired;
            case "osVolumeTpmPinRequired": return OsVolumeTpmPinRequired;
            case "osVolumeTpmStartupKeyRequired": return OsVolumeTpmStartupKeyRequired;
            case "osVolumeTpmPinStartupKeyRequired": return OsVolumeTpmPinStartupKeyRequired;
            case "osVolumeEncryptionMethodMismatch": return OsVolumeEncryptionMethodMismatch;
            case "recoveryKeyBackupFailed": return RecoveryKeyBackupFailed;
            case "fixedDriveNotEncrypted": return FixedDriveNotEncrypted;
            case "fixedDriveEncryptionMethodMismatch": return FixedDriveEncryptionMethodMismatch;
            case "loggedOnUserNonAdmin": return LoggedOnUserNonAdmin;
            case "windowsRecoveryEnvironmentNotConfigured": return WindowsRecoveryEnvironmentNotConfigured;
            case "tpmNotAvailable": return TpmNotAvailable;
            case "tpmNotReady": return TpmNotReady;
            case "networkError": return NetworkError;
            default: return null;
        }
    }
}
