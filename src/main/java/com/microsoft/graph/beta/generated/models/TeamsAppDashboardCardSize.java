package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamsAppDashboardCardSize implements ValuedEnum {
    Medium("medium"),
    Large("large"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAppDashboardCardSize(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamsAppDashboardCardSize forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "medium": return Medium;
            case "large": return Large;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
