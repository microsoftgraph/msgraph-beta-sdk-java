package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum UpdateCategory implements ValuedEnum {
    Feature("feature"),
    Quality("quality"),
    UnknownFutureValue("unknownFutureValue"),
    Driver("driver");
    public final String value;
    UpdateCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static UpdateCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "feature": return Feature;
            case "quality": return Quality;
            case "unknownFutureValue": return UnknownFutureValue;
            case "driver": return Driver;
            default: return null;
        }
    }
}
