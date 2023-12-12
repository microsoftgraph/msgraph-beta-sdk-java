package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of elevation occured
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrivilegeManagementElevationType implements ValuedEnum {
    /** Default. If the type was unknown on the client for some reasons. */
    Undetermined("undetermined"),
    /** The elevation was done without any use of endpoint privilege management. For example: the administrator on a client machine elevated an application with their admin right. */
    UnmanagedElevation("unmanagedElevation"),
    /** The elevation was done using the endpoint privilege management zero touch elevation policy. */
    ZeroTouchElevation("zeroTouchElevation"),
    /** The elevation was done using the endpoint privilege management user confirmed elevation policy. */
    UserConfirmedElevation("userConfirmedElevation"),
    /** The elevation was done using the endpoint privilege management support approved elevation policy. */
    SupportApprovedElevation("supportApprovedElevation"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrivilegeManagementElevationType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrivilegeManagementElevationType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undetermined": return Undetermined;
            case "unmanagedElevation": return UnmanagedElevation;
            case "zeroTouchElevation": return ZeroTouchElevation;
            case "userConfirmedElevation": return UserConfirmedElevation;
            case "supportApprovedElevation": return SupportApprovedElevation;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
