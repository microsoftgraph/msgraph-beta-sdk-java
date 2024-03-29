package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamsAppInstallationScopes implements ValuedEnum {
    Team("team"),
    GroupChat("groupChat"),
    Personal("personal"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamsAppInstallationScopes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamsAppInstallationScopes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "team": return Team;
            case "groupChat": return GroupChat;
            case "personal": return Personal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
