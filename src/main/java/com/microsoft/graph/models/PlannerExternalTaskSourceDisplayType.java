package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PlannerExternalTaskSourceDisplayType implements ValuedEnum {
    None("none"),
    DefaultEscaped("default"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerExternalTaskSourceDisplayType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerExternalTaskSourceDisplayType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "default": return DefaultEscaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
