package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UpdateCategory implements ValuedEnum {
    Feature("feature"),
    Quality("quality"),
    UnknownFutureValue("unknownFutureValue"),
    Driver("driver");
    public final String value;
    UpdateCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UpdateCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
