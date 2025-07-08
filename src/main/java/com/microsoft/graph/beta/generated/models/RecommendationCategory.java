package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecommendationCategory implements ValuedEnum {
    IdentityBestPractice("identityBestPractice"),
    IdentitySecureScore("identitySecureScore"),
    UnknownFutureValue("unknownFutureValue"),
    MdiSecureScore("mdiSecureScore");
    public final String value;
    RecommendationCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecommendationCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "identityBestPractice": return IdentityBestPractice;
            case "identitySecureScore": return IdentitySecureScore;
            case "unknownFutureValue": return UnknownFutureValue;
            case "mdiSecureScore": return MdiSecureScore;
            default: return null;
        }
    }
}
