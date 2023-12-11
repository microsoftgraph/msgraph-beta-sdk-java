package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerCreationSourceKind implements ValuedEnum {
    None("none"),
    External("external"),
    Publication("publication"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerCreationSourceKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerCreationSourceKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "external": return External;
            case "publication": return Publication;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
