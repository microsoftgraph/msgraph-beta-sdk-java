package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EmailCertificateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "certificate": return Certificate;
            case "derivedCredential": return DerivedCredential;
            default: return null;
        }
    }
}
