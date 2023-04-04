package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EligibilityFilteringEnabledEntities implements ValuedEnum {
    None("none"),
    SwapRequest("swapRequest"),
    OfferShiftRequest("offerShiftRequest"),
    UnknownFutureValue("unknownFutureValue"),
    TimeOffReason("timeOffReason");
    public final String value;
    EligibilityFilteringEnabledEntities(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EligibilityFilteringEnabledEntities forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "swapRequest": return SwapRequest;
            case "offerShiftRequest": return OfferShiftRequest;
            case "unknownFutureValue": return UnknownFutureValue;
            case "timeOffReason": return TimeOffReason;
            default: return null;
        }
    }
}
