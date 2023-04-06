package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum NotificationDestination implements ValuedEnum {
    None("none"),
    Api("api"),
    Email("email"),
    Sms("sms"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NotificationDestination(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static NotificationDestination forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "api": return Api;
            case "email": return Email;
            case "sms": return Sms;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
