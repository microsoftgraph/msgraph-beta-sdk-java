package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EndUserNotificationPreference implements ValuedEnum {
    Unknown("unknown"),
    Microsoft("microsoft"),
    Custom("custom"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EndUserNotificationPreference(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EndUserNotificationPreference forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "microsoft": return Microsoft;
            case "custom": return Custom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
