package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ContentLinkType implements ValuedEnum {
    DocumentReference("documentReference"),
    WebReference("webReference"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ContentLinkType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ContentLinkType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "documentReference": return DocumentReference;
            case "webReference": return WebReference;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
