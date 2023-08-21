package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Key Storage Provider (KSP) Import Options.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum KeyStorageProviderOption implements ValuedEnum {
    /** Import to Trusted Platform Module (TPM) KSP if present, otherwise import to Software KSP. */
    UseTpmKspOtherwiseUseSoftwareKsp("useTpmKspOtherwiseUseSoftwareKsp"),
    /** Import to Trusted Platform Module (TPM) KSP if present, otherwise fail. */
    UseTpmKspOtherwiseFail("useTpmKspOtherwiseFail"),
    /** Import to Passport for work KSP if available, otherwise fail. */
    UsePassportForWorkKspOtherwiseFail("usePassportForWorkKspOtherwiseFail"),
    /** Import to Software KSP. */
    UseSoftwareKsp("useSoftwareKsp");
    public final String value;
    KeyStorageProviderOption(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static KeyStorageProviderOption forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "useTpmKspOtherwiseUseSoftwareKsp": return UseTpmKspOtherwiseUseSoftwareKsp;
            case "useTpmKspOtherwiseFail": return UseTpmKspOtherwiseFail;
            case "usePassportForWorkKspOtherwiseFail": return UsePassportForWorkKspOtherwiseFail;
            case "useSoftwareKsp": return UseSoftwareKsp;
            default: return null;
        }
    }
}
