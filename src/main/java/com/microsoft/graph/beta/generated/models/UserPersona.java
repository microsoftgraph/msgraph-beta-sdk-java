package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UserPersona implements ValuedEnum {
    Unknown("unknown"),
    ExternalMember("externalMember"),
    ExternalGuest("externalGuest"),
    InternalMember("internalMember"),
    InternalGuest("internalGuest"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserPersona(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserPersona forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "externalMember": return ExternalMember;
            case "externalGuest": return ExternalGuest;
            case "internalMember": return InternalMember;
            case "internalGuest": return InternalGuest;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
