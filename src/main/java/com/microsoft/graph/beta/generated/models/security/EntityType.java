package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EntityType implements ValuedEnum {
    UserName("userName"),
    IpAddress("ipAddress"),
    MachineName("machineName"),
    Other("other"),
    Unknown("unknown"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EntityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EntityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userName": return UserName;
            case "ipAddress": return IpAddress;
            case "machineName": return MachineName;
            case "other": return Other;
            case "unknown": return Unknown;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
