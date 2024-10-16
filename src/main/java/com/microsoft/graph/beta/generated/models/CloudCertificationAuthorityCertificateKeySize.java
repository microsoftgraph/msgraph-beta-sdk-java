package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum of possible cloud certification authority certificate cryptography and key size combinations.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudCertificationAuthorityCertificateKeySize implements ValuedEnum {
    /** Default. Unknown or invalid value. */
    Unknown("unknown"),
    /** A certificate generated using RSA cryptography and a key size of 2048 bits. */
    Rsa2048("rsa2048"),
    /** A certificate generated using RSA cryptography and a key size of 3072 bits. */
    Rsa3072("rsa3072"),
    /** A certificate generated using RSA cryptography and a key size of 4096 bits. */
    Rsa4096("rsa4096"),
    /** A certificate generated using Elliptic Curve cryptography and a key size of 256 bits. */
    ECP256("eCP256"),
    /** A certificate generated using Elliptic Curve cryptography and a key size of 256 bits with a Koblitz curve. */
    ECP256k("eCP256k"),
    /** A certificate generated using Elliptic Curve cryptography and a key size of 384 bits. */
    ECP384("eCP384"),
    /** A certificate generated using Elliptic Curve cryptography and a key size of 521 bits. */
    ECP521("eCP521"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudCertificationAuthorityCertificateKeySize(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudCertificationAuthorityCertificateKeySize forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "rsa2048": return Rsa2048;
            case "rsa3072": return Rsa3072;
            case "rsa4096": return Rsa4096;
            case "eCP256": return ECP256;
            case "eCP256k": return ECP256k;
            case "eCP384": return ECP384;
            case "eCP521": return ECP521;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
