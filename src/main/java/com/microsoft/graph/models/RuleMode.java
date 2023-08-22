package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RuleMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
