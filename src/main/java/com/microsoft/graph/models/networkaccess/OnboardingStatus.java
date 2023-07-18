package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OnboardingStatus implements ValuedEnum {
    Offboarded("offboarded"),
    OffboardingInProgress("offboardingInProgress"),
    OnboardingInProgress("onboardingInProgress"),
    Onboarded("onboarded"),
    OnboardingErrorOccurred("onboardingErrorOccurred"),
    OffboardingErrorOccurred("offboardingErrorOccurred"),
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
            case "offboarded": return Offboarded;
            case "offboardingInProgress": return OffboardingInProgress;
            case "onboardingInProgress": return OnboardingInProgress;
            case "onboarded": return Onboarded;
            case "onboardingErrorOccurred": return OnboardingErrorOccurred;
            case "offboardingErrorOccurred": return OffboardingErrorOccurred;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
