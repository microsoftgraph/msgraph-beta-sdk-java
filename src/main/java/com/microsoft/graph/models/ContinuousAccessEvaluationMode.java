package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ContinuousAccessEvaluationMode implements ValuedEnum {
    StrictEnforcement("strictEnforcement"),
    Disabled("disabled"),
    UnknownFutureValue("unknownFutureValue"),
    StrictLocation("strictLocation");
    public final String value;
    ContinuousAccessEvaluationMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContinuousAccessEvaluationMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "strictEnforcement": return StrictEnforcement;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            case "strictLocation": return StrictLocation;
            default: return null;
        }
    }
}
