package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Recovery key types for macOS FileVault
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSFileVaultRecoveryKeyTypes implements ValuedEnum {
    /** Device default value, no intent. */
    NotConfigured("notConfigured"),
    /** An institutional recovery key is like a master recovery key that can be used to unlock any device whose password has been lost. */
    InstitutionalRecoveryKey("institutionalRecoveryKey"),
    /** A personal recovery key is a unique code that can be used to unlock the users device, even if the password to the device is lost. */
    PersonalRecoveryKey("personalRecoveryKey");
    public final String value;
    MacOSFileVaultRecoveryKeyTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSFileVaultRecoveryKeyTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "institutionalRecoveryKey": return InstitutionalRecoveryKey;
            case "personalRecoveryKey": return PersonalRecoveryKey;
            default: return null;
        }
    }
}
