package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ApiFormat implements ValuedEnum {
    OneRoster("oneRoster"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApiFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ApiFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "oneRoster": return OneRoster;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
