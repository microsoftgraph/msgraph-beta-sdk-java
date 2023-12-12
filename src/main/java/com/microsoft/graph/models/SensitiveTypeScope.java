package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SensitiveTypeScope implements ValuedEnum {
    FullDocument("fullDocument"),
    PartialDocument("partialDocument");
    public final String value;
    SensitiveTypeScope(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SensitiveTypeScope forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fullDocument": return FullDocument;
            case "partialDocument": return PartialDocument;
            default: return null;
        }
    }
}
