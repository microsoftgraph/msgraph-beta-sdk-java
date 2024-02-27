package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ResourceScopeType implements ValuedEnum {
    Group("group"),
    Chat("chat"),
    Tenant("tenant"),
    UnknownFutureValue("unknownFutureValue"),
    Team("team");
    public final String value;
    ResourceScopeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ResourceScopeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group": return Group;
            case "chat": return Chat;
            case "tenant": return Tenant;
            case "unknownFutureValue": return UnknownFutureValue;
            case "team": return Team;
            default: return null;
        }
    }
}
