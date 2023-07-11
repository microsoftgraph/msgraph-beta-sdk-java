package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum GroupPrivacy implements ValuedEnum {
    Unspecified("unspecified"),
    Public("public"),
    Private("private"),
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
            case "public": return Public;
            case "private": return Private;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
