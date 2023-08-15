package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ReplyRestriction implements ValuedEnum {
    Everyone("everyone"),
    AuthorAndModerators("authorAndModerators"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ReplyRestriction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ReplyRestriction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "authorAndModerators": return AuthorAndModerators;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
