package com.microsoft.graph.beta.models.teamsadministration;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssignmentType implements ValuedEnum {
    Direct("direct"),
    Group("group"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssignmentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssignmentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "direct": return Direct;
            case "group": return Group;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
