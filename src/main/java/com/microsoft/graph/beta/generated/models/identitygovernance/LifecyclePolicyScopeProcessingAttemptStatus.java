package com.microsoft.graph.beta.models.identitygovernance;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum LifecyclePolicyScopeProcessingAttemptStatus implements ValuedEnum {
    NotStarted("notStarted"),
    Evaluating("evaluating"),
    Processing("processing"),
    Completed("completed"),
    Failed("failed"),
    TimedOut("timedOut"),
    InvalidScope("invalidScope"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LifecyclePolicyScopeProcessingAttemptStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static LifecyclePolicyScopeProcessingAttemptStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notStarted": return NotStarted;
            case "evaluating": return Evaluating;
            case "processing": return Processing;
            case "completed": return Completed;
            case "failed": return Failed;
            case "timedOut": return TimedOut;
            case "invalidScope": return InvalidScope;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
