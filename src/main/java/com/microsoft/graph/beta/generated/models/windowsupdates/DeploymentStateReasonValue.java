package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeploymentStateReasonValue implements ValuedEnum {
    ScheduledByOfferWindow("scheduledByOfferWindow"),
    OfferingByRequest("offeringByRequest"),
    PausedByRequest("pausedByRequest"),
    PausedByMonitoring("pausedByMonitoring"),
    UnknownFutureValue("unknownFutureValue"),
    FaultedByContentOutdated("faultedByContentOutdated");
    public final String value;
    DeploymentStateReasonValue(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeploymentStateReasonValue forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "scheduledByOfferWindow": return ScheduledByOfferWindow;
            case "offeringByRequest": return OfferingByRequest;
            case "pausedByRequest": return PausedByRequest;
            case "pausedByMonitoring": return PausedByMonitoring;
            case "unknownFutureValue": return UnknownFutureValue;
            case "faultedByContentOutdated": return FaultedByContentOutdated;
            default: return null;
        }
    }
}
