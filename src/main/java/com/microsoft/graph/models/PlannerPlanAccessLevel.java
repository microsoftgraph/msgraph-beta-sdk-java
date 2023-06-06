package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PlannerPlanAccessLevel implements ValuedEnum {
    ReadAccess("readAccess"),
    ReadWriteAccess("readWriteAccess"),
    FullAccess("fullAccess"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerPlanAccessLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerPlanAccessLevel forValue(@javax.annotation.Nonnull final String searchValue) {
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
