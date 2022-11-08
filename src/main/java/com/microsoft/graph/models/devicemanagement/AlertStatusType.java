package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum AlertStatusType implements ValuedEnum {
    Active("active"),
    Resolved("resolved"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AlertStatusType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AlertStatusType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "resolved": return Resolved;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
