package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileEntityIdentifier implements ValuedEnum {
    Sha1("sha1"),
    InitiatingProcessSHA1("initiatingProcessSHA1"),
    Sha256("sha256"),
    InitiatingProcessSHA256("initiatingProcessSHA256"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileEntityIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileEntityIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sha1": return Sha1;
            case "initiatingProcessSHA1": return InitiatingProcessSHA1;
            case "sha256": return Sha256;
            case "initiatingProcessSHA256": return InitiatingProcessSHA256;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
