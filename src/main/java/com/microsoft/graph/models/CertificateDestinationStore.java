package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the deviceManagement singleton. */
public enum CertificateDestinationStore implements ValuedEnum {
    /** Computer Certificate Store - Root. */
    ComputerCertStoreRoot("computerCertStoreRoot"),
    /** Computer Certificate Store - Intermediate. */
    ComputerCertStoreIntermediate("computerCertStoreIntermediate"),
    /** User Certificate Store - Intermediate. */
    UserCertStoreIntermediate("userCertStoreIntermediate");
    public final String value;
    CertificateDestinationStore(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CertificateDestinationStore forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "computerCertStoreRoot": return ComputerCertStoreRoot;
            case "computerCertStoreIntermediate": return ComputerCertStoreIntermediate;
            case "userCertStoreIntermediate": return UserCertStoreIntermediate;
            default: return null;
        }
    }
}
