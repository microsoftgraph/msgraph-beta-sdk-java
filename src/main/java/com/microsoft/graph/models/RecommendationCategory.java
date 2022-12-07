package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum RecommendationCategory implements ValuedEnum {
    UsageAndCompliance("usageAndCompliance"),
    Security("security"),
    UnknownFutureValue("unknownFutureValue"),
    Productivity("productivity"),
    Health("health"),
    Configuration("configuration");
    public final String value;
    RecommendationCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RecommendationCategory forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "usageAndCompliance": return UsageAndCompliance;
            case "security": return Security;
            case "unknownFutureValue": return UnknownFutureValue;
            case "productivity": return Productivity;
            case "health": return Health;
            case "configuration": return Configuration;
            default: return null;
        }
    }
}
