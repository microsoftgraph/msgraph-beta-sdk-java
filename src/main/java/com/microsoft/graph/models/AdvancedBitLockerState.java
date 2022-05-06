package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum AdvancedBitLockerState implements ValuedEnum {
    Success("success"),
    NoUserConsent("noUserConsent"),
    OsVolumeUnprotected("osVolumeUnprotected"),
    OsVolumeTpmRequired("osVolumeTpmRequired"),
    OsVolumeTpmOnlyRequired("osVolumeTpmOnlyRequired"),
    OsVolumeTpmPinRequired("osVolumeTpmPinRequired"),
    OsVolumeTpmStartupKeyRequired("osVolumeTpmStartupKeyRequired"),
    OsVolumeTpmPinStartupKeyRequired("osVolumeTpmPinStartupKeyRequired"),
    OsVolumeEncryptionMethodMismatch("osVolumeEncryptionMethodMismatch"),
    RecoveryKeyBackupFailed("recoveryKeyBackupFailed"),
    FixedDriveNotEncrypted("fixedDriveNotEncrypted"),
    FixedDriveEncryptionMethodMismatch("fixedDriveEncryptionMethodMismatch"),
    LoggedOnUserNonAdmin("loggedOnUserNonAdmin"),
    WindowsRecoveryEnvironmentNotConfigured("windowsRecoveryEnvironmentNotConfigured"),
    TpmNotAvailable("tpmNotAvailable"),
    TpmNotReady("tpmNotReady"),
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
