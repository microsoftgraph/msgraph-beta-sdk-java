package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum NotificationChannelType implements ValuedEnum {
    Portal("portal"),
    Email("email"),
    PhoneCall("phoneCall"),
    Sms("sms"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    NotificationChannelType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NotificationChannelType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "portal": return Portal;
            case "email": return Email;
            case "phoneCall": return PhoneCall;
            case "sms": return Sms;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
