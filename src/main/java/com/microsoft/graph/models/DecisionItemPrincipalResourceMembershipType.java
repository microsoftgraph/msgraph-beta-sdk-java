package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum DecisionItemPrincipalResourceMembershipType implements ValuedEnum {
    Direct("direct"),
    Indirect("indirect"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DecisionItemPrincipalResourceMembershipType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DecisionItemPrincipalResourceMembershipType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "direct": return Direct;
            case "indirect": return Indirect;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
