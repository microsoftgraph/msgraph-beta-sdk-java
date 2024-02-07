package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubmissionSource implements ValuedEnum {
    User("user"),
    Administrator("administrator"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubmissionSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubmissionSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "administrator": return Administrator;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
