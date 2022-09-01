package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CertificateValidityPeriodScale forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "days": return Days;
            case "months": return Months;
            case "years": return Years;
            default: return null;
        }
    }
}
