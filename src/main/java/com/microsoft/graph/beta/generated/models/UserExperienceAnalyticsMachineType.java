package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates if machine is physical or virtual. Possible values are: physical or virtual
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserExperienceAnalyticsMachineType implements ValuedEnum {
    /** Indicates that the type is unknown. */
    Unknown("unknown"),
    /** Indicates that the Machine is physical. */
    Physical("physical"),
    /** Indicates that the machine is virtual. */
    Virtual("virtual"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserExperienceAnalyticsMachineType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserExperienceAnalyticsMachineType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "physical": return Physical;
            case "virtual": return Virtual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
