package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum FeatureType implements ValuedEnum {
    Registration("registration"),
    Reset("reset"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FeatureType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static FeatureType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "registration": return Registration;
            case "reset": return Reset;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
