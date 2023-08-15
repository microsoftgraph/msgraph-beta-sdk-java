package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum UserNewMessageRestriction implements ValuedEnum {
    Everyone("everyone"),
    EveryoneExceptGuests("everyoneExceptGuests"),
    Moderators("moderators"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UserNewMessageRestriction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UserNewMessageRestriction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "everyone": return Everyone;
            case "everyoneExceptGuests": return EveryoneExceptGuests;
            case "moderators": return Moderators;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
