package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The onboarding status of the tenant.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnboardingStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
