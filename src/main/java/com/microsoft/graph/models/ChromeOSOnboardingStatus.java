package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The onboarding status of the tenant.
 */
public enum ChromeOSOnboardingStatus implements ValuedEnum {
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
    ChromeOSOnboardingStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ChromeOSOnboardingStatus forValue(@javax.annotation.Nonnull final String searchValue) {
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
