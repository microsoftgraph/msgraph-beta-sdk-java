package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum CloudPcAuditActivityOperationType implements ValuedEnum {
    Create("create"),
    Delete("delete"),
    Patch("patch"),
    Other("other");
    public final String value;
    CloudPcAuditActivityOperationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcAuditActivityOperationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "create": return Create;
            case "delete": return Delete;
            case "patch": return Patch;
            case "other": return Other;
            default: return null;
        }
    }
}
