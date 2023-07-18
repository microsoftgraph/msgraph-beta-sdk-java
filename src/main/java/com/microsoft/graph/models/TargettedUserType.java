package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TargettedUserType implements ValuedEnum {
    Unknown("unknown"),
    Clicked("clicked"),
    Compromised("compromised"),
    AllUsers("allUsers"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TargettedUserType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TargettedUserType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "clicked": return Clicked;
            case "compromised": return Compromised;
            case "allUsers": return AllUsers;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
