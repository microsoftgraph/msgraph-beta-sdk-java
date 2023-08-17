package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EmailEntityIdentifier implements ValuedEnum {
    NetworkMessageId("networkMessageId"),
    RecipientEmailAddress("recipientEmailAddress"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EmailEntityIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EmailEntityIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "networkMessageId": return NetworkMessageId;
            case "recipientEmailAddress": return RecipientEmailAddress;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
