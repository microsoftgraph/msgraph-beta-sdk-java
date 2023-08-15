package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

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
