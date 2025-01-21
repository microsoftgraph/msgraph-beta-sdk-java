package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MailboxType implements ValuedEnum {
    Unknown("unknown"),
    User("user"),
    Shared("shared"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MailboxType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MailboxType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "user": return User;
            case "shared": return Shared;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
