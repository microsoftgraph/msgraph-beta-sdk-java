package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton.  */
public enum FileVaultState implements ValuedEnum {
    Success("success"),
    DriveEncryptedByUser("driveEncryptedByUser"),
    UserDeferredEncryption("userDeferredEncryption"),
    EscrowNotEnabled("escrowNotEnabled");
    public final String value;
    FileVaultState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FileVaultState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "success": return Success;
            case "driveEncryptedByUser": return DriveEncryptedByUser;
            case "userDeferredEncryption": return UserDeferredEncryption;
            case "escrowNotEnabled": return EscrowNotEnabled;
            default: return null;
        }
    }
}
