package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum DefenderProtectionType implements ValuedEnum {
    /** Device default value, no intent. */
    UserDefined("userDefined"),
    /** Block functionality. */
    Enable("enable"),
    /** Allow functionality but generate logs. */
    AuditMode("auditMode"),
    /** Warning message to end user with ability to bypass block from attack surface reduction rule. */
    Warn("warn"),
    /** Not configured. */
    NotConfigured("notConfigured");
    public final String value;
    DefenderProtectionType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DefenderProtectionType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "enable": return Enable;
            case "auditMode": return AuditMode;
            case "warn": return Warn;
            case "notConfigured": return NotConfigured;
            default: return null;
        }
    }
}
