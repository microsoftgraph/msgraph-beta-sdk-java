package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamTemplateAudience implements ValuedEnum {
    Organization("organization"),
    User("user"),
    Public("public"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamTemplateAudience(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamTemplateAudience forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "organization": return Organization;
            case "user": return User;
            case "public": return Public;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
