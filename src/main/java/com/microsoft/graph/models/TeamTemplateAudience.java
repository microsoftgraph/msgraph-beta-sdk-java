package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TeamTemplateAudience implements ValuedEnum {
    Organization("organization"),
    User("user"),
    PublicEscaped("public"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamTemplateAudience(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TeamTemplateAudience forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "organization": return Organization;
            case "user": return User;
            case "public": return PublicEscaped;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
