package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerPlanAccessLevel implements ValuedEnum {
    ReadAccess("readAccess"),
    ReadWriteAccess("readWriteAccess"),
    FullAccess("fullAccess"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerPlanAccessLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerPlanAccessLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "readAccess": return ReadAccess;
            case "readWriteAccess": return ReadWriteAccess;
            case "fullAccess": return FullAccess;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
