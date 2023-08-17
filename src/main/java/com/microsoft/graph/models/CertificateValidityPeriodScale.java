package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Certificate Validity Period Options.
 */
public enum CertificateValidityPeriodScale implements ValuedEnum {
    /** Days. */
    Days("days"),
    /** Months. */
    Months("months"),
    /** Years. */
    Years("years");
    public final String value;
    CertificateValidityPeriodScale(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CertificateValidityPeriodScale forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "days": return Days;
            case "months": return Months;
            case "years": return Years;
            default: return null;
        }
    }
}
