package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum TimeCardState implements ValuedEnum {
    ClockedIn("clockedIn"),
    OnBreak("onBreak"),
    ClockedOut("clockedOut"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TimeCardState(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TimeCardState forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "clockedIn": return ClockedIn;
            case "onBreak": return OnBreak;
            case "clockedOut": return ClockedOut;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
