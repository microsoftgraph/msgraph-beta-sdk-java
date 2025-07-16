package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RoutingPolicy implements ValuedEnum {
    None("none"),
    NoMissedCall("noMissedCall"),
    DisableForwardingExceptPhone("disableForwardingExceptPhone"),
    DisableForwarding("disableForwarding"),
    PreferSkypeForBusiness("preferSkypeForBusiness"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RoutingPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RoutingPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "noMissedCall": return NoMissedCall;
            case "disableForwardingExceptPhone": return DisableForwardingExceptPhone;
            case "disableForwarding": return DisableForwarding;
            case "preferSkypeForBusiness": return PreferSkypeForBusiness;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
