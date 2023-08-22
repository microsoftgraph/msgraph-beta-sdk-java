package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecommendationFeatureAreas implements ValuedEnum {
    Users("users"),
    Groups("groups"),
    Devices("devices"),
    Applications("applications"),
    AccessReviews("accessReviews"),
    ConditionalAccess("conditionalAccess"),
    Governance("governance"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RecommendationFeatureAreas(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecommendationFeatureAreas forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "users": return Users;
            case "groups": return Groups;
            case "devices": return Devices;
            case "applications": return Applications;
            case "accessReviews": return AccessReviews;
            case "conditionalAccess": return ConditionalAccess;
            case "governance": return Governance;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
