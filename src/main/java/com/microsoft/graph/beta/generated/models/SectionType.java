package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SectionType implements ValuedEnum {
    UserDefined("userDefined"),
    SystemDefined("systemDefined"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SectionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SectionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "userDefined": return UserDefined;
            case "systemDefined": return SystemDefined;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
