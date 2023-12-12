package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ClassificationMethod implements ValuedEnum {
    PatternMatch("patternMatch"),
    ExactDataMatch("exactDataMatch"),
    Fingerprint("fingerprint"),
    MachineLearning("machineLearning");
    public final String value;
    ClassificationMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ClassificationMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "patternMatch": return PatternMatch;
            case "exactDataMatch": return ExactDataMatch;
            case "fingerprint": return Fingerprint;
            case "machineLearning": return MachineLearning;
            default: return null;
        }
    }
}
