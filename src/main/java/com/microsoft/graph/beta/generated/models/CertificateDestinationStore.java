package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values for the Certificate Destination Store.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CertificateDestinationStore forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "computerCertStoreRoot": return ComputerCertStoreRoot;
            case "computerCertStoreIntermediate": return ComputerCertStoreIntermediate;
            case "userCertStoreIntermediate": return UserCertStoreIntermediate;
            default: return null;
        }
    }
}
