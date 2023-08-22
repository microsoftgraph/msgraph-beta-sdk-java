package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubmissionContentType implements ValuedEnum {
    Email("email"),
    Url("url"),
    File("file"),
    App("app"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubmissionContentType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubmissionContentType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email": return Email;
            case "url": return Url;
            case "file": return File;
            case "app": return App;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
