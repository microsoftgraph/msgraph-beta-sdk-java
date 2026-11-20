package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RecommendationCategoryGroup implements ValuedEnum {
    StrengthenAuthentication("strengthenAuthentication"),
    DetectAndRespondToThreats("detectAndRespondToThreats"),
    EnforceLeastPrivilege("enforceLeastPrivilege"),
    GovernAppsCredentialsAndAgents("governAppsCredentialsAndAgents"),
    HardenInfrastructure("hardenInfrastructure"),
    DefenderForIdentity("defenderForIdentity"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RecommendationCategoryGroup(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RecommendationCategoryGroup forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "strengthenAuthentication": return StrengthenAuthentication;
            case "detectAndRespondToThreats": return DetectAndRespondToThreats;
            case "enforceLeastPrivilege": return EnforceLeastPrivilege;
            case "governAppsCredentialsAndAgents": return GovernAppsCredentialsAndAgents;
            case "hardenInfrastructure": return HardenInfrastructure;
            case "defenderForIdentity": return DefenderForIdentity;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
