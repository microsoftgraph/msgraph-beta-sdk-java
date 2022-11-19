package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum SubmissionSource implements ValuedEnum {
    User("user"),
    Administrator("administrator"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubmissionSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SubmissionSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "administrator": return Administrator;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
