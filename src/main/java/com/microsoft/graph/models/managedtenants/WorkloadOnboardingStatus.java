package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum WorkloadOnboardingStatus implements ValuedEnum {
    NotOnboarded("notOnboarded"),
    Onboarded("onboarded"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkloadOnboardingStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkloadOnboardingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notOnboarded": return NotOnboarded;
            case "onboarded": return Onboarded;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
