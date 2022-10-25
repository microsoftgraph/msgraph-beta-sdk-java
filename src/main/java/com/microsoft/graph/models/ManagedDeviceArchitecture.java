package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum ManagedDeviceArchitecture implements ValuedEnum {
    /** Unknown architecture */
    Unknown("unknown"),
    /** X86 */
    X86("x86"),
    /** X64 */
    X64("x64"),
    /** ARM */
    Arm("arm"),
    /** ARM64 */
    ArM64("arM64");
    public final String value;
    ManagedDeviceArchitecture(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ManagedDeviceArchitecture forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "x86": return X86;
            case "x64": return X64;
            case "arm": return Arm;
            case "arM64": return ArM64;
            default: return null;
        }
    }
}
