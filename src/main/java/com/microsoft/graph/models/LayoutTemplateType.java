package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum LayoutTemplateType implements ValuedEnum {
    Default_escaped("default_escaped"),
    VerticalSplit("verticalSplit"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    LayoutTemplateType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static LayoutTemplateType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default_escaped;
            case "verticalSplit": return VerticalSplit;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
