package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SectionItemType implements ValuedEnum {
    Chat("chat"),
    Channel("channel"),
    Meeting("meeting"),
    Community("community"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SectionItemType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SectionItemType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "chat": return Chat;
            case "channel": return Channel;
            case "meeting": return Meeting;
            case "community": return Community;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
