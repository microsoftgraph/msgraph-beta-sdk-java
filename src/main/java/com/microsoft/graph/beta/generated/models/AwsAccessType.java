package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AwsAccessType implements ValuedEnum {
    Public("public"),
    Restricted("restricted"),
    CrossAccount("crossAccount"),
    Private("private"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AwsAccessType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AwsAccessType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "public": return Public;
            case "restricted": return Restricted;
            case "crossAccount": return CrossAccount;
            case "private": return Private;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
