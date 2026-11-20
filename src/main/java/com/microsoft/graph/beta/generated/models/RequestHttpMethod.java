package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RequestHttpMethod implements ValuedEnum {
    Post("post"),
    Patch("patch"),
    Put("put"),
    Get("get"),
    Delete("delete"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RequestHttpMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RequestHttpMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "post": return Post;
            case "patch": return Patch;
            case "put": return Put;
            case "get": return Get;
            case "delete": return Delete;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
