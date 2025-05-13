package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the type of the targets that devices will become members of when enrolled with the associated profile. Possible values are staticSecurityGroup.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnrollmentTimeDeviceMembershipTargetType implements ValuedEnum {
    /** Indicates the device membership target specified refer to static Entra Security Groups. */
    StaticSecurityGroup("staticSecurityGroup"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnrollmentTimeDeviceMembershipTargetType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnrollmentTimeDeviceMembershipTargetType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "staticSecurityGroup": return StaticSecurityGroup;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
