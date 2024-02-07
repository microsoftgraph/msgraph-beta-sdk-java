package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported certificate sources for email signing and encryption.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EmailCertificateType implements ValuedEnum {
    /** Do not use a certificate as a source. */
    None("none"),
    /** Use an certificate for certificate source. */
    Certificate("certificate"),
    /** Use a derived credential for certificate source. */
    DerivedCredential("derivedCredential");
    public final String value;
    EmailCertificateType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EmailCertificateType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "certificate": return Certificate;
            case "derivedCredential": return DerivedCredential;
            default: return null;
        }
    }
}
