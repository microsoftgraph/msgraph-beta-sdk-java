package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DecisionItemPrincipalResourceMembershipType implements ValuedEnum {
    Direct("direct"),
    Indirect("indirect"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DecisionItemPrincipalResourceMembershipType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DecisionItemPrincipalResourceMembershipType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "direct": return Direct;
            case "indirect": return Indirect;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
