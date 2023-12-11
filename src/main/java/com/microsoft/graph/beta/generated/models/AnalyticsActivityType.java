package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AnalyticsActivityType implements ValuedEnum {
    Email("Email"),
    Meeting("Meeting"),
    Focus("Focus"),
    Chat("Chat"),
    Call("Call");
    public final String value;
    AnalyticsActivityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AnalyticsActivityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Email": return Email;
            case "Meeting": return Meeting;
            case "Focus": return Focus;
            case "Chat": return Chat;
            case "Call": return Call;
            default: return null;
        }
    }
}
