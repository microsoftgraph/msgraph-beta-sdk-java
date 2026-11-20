package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyComplianceState implements ValuedEnum {
    Compliant("compliant"),
    Warning("warning"),
    WarningNotify("warningNotify"),
    NonCompliant("nonCompliant");
    public final String value;
    LifecyclePolicyComplianceState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyComplianceState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "compliant": return Compliant;
            case "warning": return Warning;
            case "warningNotify": return WarningNotify;
            case "nonCompliant": return NonCompliant;
            default: return null;
        }
    }
}
