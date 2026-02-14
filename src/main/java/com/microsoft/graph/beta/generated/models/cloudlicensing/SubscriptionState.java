package com.microsoft.graph.beta.models.cloudlicensing;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum SubscriptionState implements ValuedEnum {
    Active("active"),
    Warning("warning"),
    Suspended("suspended"),
    LockedOut("lockedOut"),
    Deleted("deleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    SubscriptionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SubscriptionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "active": return Active;
            case "warning": return Warning;
            case "suspended": return Suspended;
            case "lockedOut": return LockedOut;
            case "deleted": return Deleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
