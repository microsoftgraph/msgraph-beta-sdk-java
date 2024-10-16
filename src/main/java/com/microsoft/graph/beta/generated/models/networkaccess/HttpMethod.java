package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HttpMethod implements ValuedEnum {
    Get("get"),
    Post("post"),
    Put("put"),
    Delete("delete"),
    Head("head"),
    Options("options"),
    Connect("connect"),
    Patch("patch"),
    Trace("trace"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HttpMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HttpMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "get": return Get;
            case "post": return Post;
            case "put": return Put;
            case "delete": return Delete;
            case "head": return Head;
            case "options": return Options;
            case "connect": return Connect;
            case "patch": return Patch;
            case "trace": return Trace;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
