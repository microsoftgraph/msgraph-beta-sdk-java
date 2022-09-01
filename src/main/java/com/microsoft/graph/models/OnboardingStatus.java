package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum OnboardingStatus implements ValuedEnum {
    /** Unknown */
    Unknown("unknown"),
    /** In progress */
    Inprogress("inprogress"),
    /** Onboarded */
    Onboarded("onboarded"),
    /** Failed */
    Failed("failed"),
    /** Offboarding */
    Offboarding("offboarding"),
    /** UnknownFutureValue */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnboardingStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OnboardingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "inprogress": return Inprogress;
            case "onboarded": return Onboarded;
            case "failed": return Failed;
            case "offboarding": return Offboarding;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
