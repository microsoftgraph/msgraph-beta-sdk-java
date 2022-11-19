package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RoutingPolicy forValue(@javax.annotation.Nonnull final String searchValue) {
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
