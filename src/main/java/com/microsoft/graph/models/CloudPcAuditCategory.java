package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum CloudPcAuditCategory implements ValuedEnum {
    CloudPC("cloudPC"),
    Other("other");
    public final String value;
    CloudPcAuditCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcAuditCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "cloudPC": return CloudPC;
            case "other": return Other;
            default: return null;
        }
    }
}
