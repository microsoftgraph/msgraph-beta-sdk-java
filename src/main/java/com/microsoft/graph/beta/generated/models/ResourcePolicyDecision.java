package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResourcePolicyDecision implements ValuedEnum {
    Deny("deny"),
    None("none"),
    Compliant("compliant"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ResourcePolicyDecision(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResourcePolicyDecision forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "deny": return Deny;
            case "none": return None;
            case "compliant": return Compliant;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
