package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkSupportedClient implements ValuedEnum {
    Unknown("unknown"),
    SkypeDefaultAndTeams("skypeDefaultAndTeams"),
    TeamsDefaultAndSkype("teamsDefaultAndSkype"),
    SkypeOnly("skypeOnly"),
    TeamsOnly("teamsOnly"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkSupportedClient(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkSupportedClient forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "skypeDefaultAndTeams": return SkypeDefaultAndTeams;
            case "teamsDefaultAndSkype": return TeamsDefaultAndSkype;
            case "skypeOnly": return SkypeOnly;
            case "teamsOnly": return TeamsOnly;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
