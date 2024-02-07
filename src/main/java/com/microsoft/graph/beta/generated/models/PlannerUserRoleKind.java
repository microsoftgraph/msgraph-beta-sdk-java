package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerUserRoleKind implements ValuedEnum {
    Relationship("relationship"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerUserRoleKind(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerUserRoleKind forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "relationship": return Relationship;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
