package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MailboxRecipientType implements ValuedEnum {
    Unknown("unknown"),
    User("user"),
    Linked("linked"),
    Shared("shared"),
    Room("room"),
    Equipment("equipment"),
    Others("others");
    public final String value;
    MailboxRecipientType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MailboxRecipientType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "user": return User;
            case "linked": return Linked;
            case "shared": return Shared;
            case "room": return Room;
            case "equipment": return Equipment;
            case "others": return Others;
            default: return null;
        }
    }
}
