package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum TeamworkInteractionType implements ValuedEnum {
    CreateChat("createChat"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TeamworkInteractionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static TeamworkInteractionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "createChat": return CreateChat;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
