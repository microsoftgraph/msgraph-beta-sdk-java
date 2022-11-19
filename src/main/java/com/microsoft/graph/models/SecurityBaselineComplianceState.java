package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum SecurityBaselineComplianceState implements ValuedEnum {
    /** Unknown state */
    Unknown("unknown"),
    /** Secure state */
    Secure("secure"),
    /** Not applicable state */
    NotApplicable("notApplicable"),
    /** Not secure state */
    NotSecure("notSecure"),
    /** Error state */
    Error("error"),
    /** Conflict state */
    Conflict("conflict");
    public final String value;
    SecurityBaselineComplianceState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SecurityBaselineComplianceState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "secure": return Secure;
            case "notApplicable": return NotApplicable;
            case "notSecure": return NotSecure;
            case "error": return Error;
            case "conflict": return Conflict;
            default: return null;
        }
    }
}
