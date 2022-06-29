package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static KeyStorageProviderOption forValue(@javax.annotation.Nonnull final String searchValue) {
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
