package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum BrowserSiteMergeType implements ValuedEnum {
    /** No merge type */
    NoMerge("noMerge"),
    /** Default merge type */
    Default_escaped("default_escaped"),
    /** Placeholder for evolvable enum, but this enum is never returned to the caller, so it shouldn't be necessary. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    BrowserSiteMergeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static BrowserSiteMergeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "noMerge": return NoMerge;
            case "default": return Default_escaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
