package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum OpenIdConnectResponseMode implements ValuedEnum {
    Form_post("form_post"),
    Query("query"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OpenIdConnectResponseMode(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OpenIdConnectResponseMode forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "form_post": return Form_post;
            case "query": return Query;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
