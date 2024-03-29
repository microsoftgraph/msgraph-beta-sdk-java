package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * FileVault State
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileVaultState implements ValuedEnum {
    /** FileVault State Success */
    Success("success"),
    /** FileVault has been enabled by user and is not being managed by policy */
    DriveEncryptedByUser("driveEncryptedByUser"),
    /** FileVault policy is successfully installed but user has not started encryption */
    UserDeferredEncryption("userDeferredEncryption"),
    /** FileVault recovery key escrow is not enabled */
    EscrowNotEnabled("escrowNotEnabled");
    public final String value;
    FileVaultState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileVaultState forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
