package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubmissionContentType forValue(@javax.annotation.Nonnull final String searchValue) {
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
