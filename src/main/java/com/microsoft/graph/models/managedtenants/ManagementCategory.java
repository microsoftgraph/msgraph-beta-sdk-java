package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ManagementCategory implements ValuedEnum {
    Custom("custom"),
    Devices("devices"),
    Identity("identity"),
    Data("data"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ManagementCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ManagementCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "custom": return Custom;
            case "devices": return Devices;
            case "identity": return Identity;
            case "data": return Data;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
