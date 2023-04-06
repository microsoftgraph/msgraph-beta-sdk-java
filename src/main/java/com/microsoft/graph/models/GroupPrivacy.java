package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum GroupPrivacy implements ValuedEnum {
    Unspecified("unspecified"),
    PublicEscaped("public"),
    PrivateEscaped("private"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    GroupPrivacy(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPrivacy forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unspecified": return Unspecified;
            case "public": return PublicEscaped;
            case "private": return PrivateEscaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
