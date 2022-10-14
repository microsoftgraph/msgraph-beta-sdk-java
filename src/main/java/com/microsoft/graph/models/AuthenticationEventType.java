package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AuthenticationEventType implements ValuedEnum {
    TokenIssuanceStart("tokenIssuanceStart"),
    PageRenderStart("pageRenderStart"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationEventType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AuthenticationEventType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tokenIssuanceStart": return TokenIssuanceStart;
            case "pageRenderStart": return PageRenderStart;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
