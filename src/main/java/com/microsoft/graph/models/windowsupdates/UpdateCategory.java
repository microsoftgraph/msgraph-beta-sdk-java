package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum UpdateCategory implements ValuedEnum {
    Feature("feature"),
    Quality("quality"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UpdateCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UpdateCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "feature": return Feature;
            case "quality": return Quality;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
