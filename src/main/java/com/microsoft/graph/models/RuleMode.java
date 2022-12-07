package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum RuleMode implements ValuedEnum {
    Audit("audit"),
    AuditAndNotify("auditAndNotify"),
    Enforce("enforce"),
    PendingDeletion("pendingDeletion"),
    Test("test");
    public final String value;
    RuleMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RuleMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "audit": return Audit;
            case "auditAndNotify": return AuditAndNotify;
            case "enforce": return Enforce;
            case "pendingDeletion": return PendingDeletion;
            case "test": return Test;
            default: return null;
        }
    }
}
