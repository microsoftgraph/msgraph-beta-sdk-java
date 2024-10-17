package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type of possible certificate hashing algorithms used by the certification authority to create certificates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudCertificationAuthorityHashingAlgorithm implements ValuedEnum {
    /** Default. The hashing algorithm is unknown or invalid. */
    Unknown("unknown"),
    /** The hashing algorithm is SHA-256. */
    Sha256("sha256"),
    /** The hashing algorithm is SHA-384. */
    Sha384("sha384"),
    /** The hashing algorithm is SHA-512. */
    Sha512("sha512"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudCertificationAuthorityHashingAlgorithm(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudCertificationAuthorityHashingAlgorithm forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "sha256": return Sha256;
            case "sha384": return Sha384;
            case "sha512": return Sha512;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
