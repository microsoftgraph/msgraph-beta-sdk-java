package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyScopeProcessingStatus implements ValuedEnum {
    Idle("idle"),
    NotStarted("notStarted"),
    Evaluating("evaluating"),
    Processing("processing"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyScopeProcessingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyScopeProcessingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "idle": return Idle;
            case "notStarted": return NotStarted;
            case "evaluating": return Evaluating;
            case "processing": return Processing;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
