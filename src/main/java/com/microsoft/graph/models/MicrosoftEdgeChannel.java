package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum MicrosoftEdgeChannel implements ValuedEnum {
    Dev("dev"),
    Beta("beta"),
    Stable("stable");
    public final String value;
    MicrosoftEdgeChannel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftEdgeChannel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "dev": return Dev;
            case "beta": return Beta;
            case "stable": return Stable;
            default: return null;
        }
    }
}
