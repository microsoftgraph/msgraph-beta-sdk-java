package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssigneeTypes implements ValuedEnum {
    None("none"),
    User("user"),
    Group("group"),
    Device("device"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AssigneeTypes(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssigneeTypes forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "user": return User;
            case "group": return Group;
            case "device": return Device;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
