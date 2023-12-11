package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of Defender Attack Surface Reduction Rules
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DefenderAttackSurfaceType implements ValuedEnum {
    /** Default, which disables attack surface reduction rule. */
    UserDefined("userDefined"),
    /** Enable the attack surface reduction rule. */
    Block("block"),
    /** Evaluate how the ASR rule would impact your organization if enabled. Does not change functionality but generate logs. */
    AuditMode("auditMode"),
    /** Warning message to end user with ability to bypass block from attack surface reduction rule. */
    Warn("warn"),
    /** Disable the attack surface reduction rule */
    Disable("disable");
    public final String value;
    DefenderAttackSurfaceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DefenderAttackSurfaceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "block": return Block;
            case "auditMode": return AuditMode;
            case "warn": return Warn;
            case "disable": return Disable;
            default: return null;
        }
    }
}
