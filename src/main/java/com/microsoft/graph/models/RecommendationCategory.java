package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum RecommendationCategory implements ValuedEnum {
    IdentityBestPractice("identityBestPractice"),
    IdentitySecureScore("identitySecureScore"),
    UnknownFutureValue("unknownFutureValue");
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
            case "identityBestPractice": return IdentityBestPractice;
            case "identitySecureScore": return IdentitySecureScore;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
