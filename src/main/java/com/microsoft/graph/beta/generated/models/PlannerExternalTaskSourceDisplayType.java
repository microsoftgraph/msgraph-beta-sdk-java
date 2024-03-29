package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerExternalTaskSourceDisplayType implements ValuedEnum {
    None("none"),
    Default("default"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerExternalTaskSourceDisplayType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerExternalTaskSourceDisplayType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "default": return Default;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
