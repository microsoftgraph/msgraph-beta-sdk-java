package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the type of elevated process
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PrivilegeManagementProcessType implements ValuedEnum {
    /** Default. If the type was unknown on the client for some reasons */
    Undefined("undefined"),
    /** The elevated process is a parent process */
    Parent("parent"),
    /** The elevated process is a child process */
    Child("child"),
    /** Evolvable emuneration sentinel value. Do not use */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PrivilegeManagementProcessType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PrivilegeManagementProcessType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "undefined": return Undefined;
            case "parent": return Parent;
            case "child": return Child;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
