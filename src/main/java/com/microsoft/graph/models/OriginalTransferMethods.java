package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OriginalTransferMethods implements ValuedEnum {
    None("none"),
    DeviceCodeFlow("deviceCodeFlow"),
    AuthenticationTransfer("authenticationTransfer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OriginalTransferMethods(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OriginalTransferMethods forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "deviceCodeFlow": return DeviceCodeFlow;
            case "authenticationTransfer": return AuthenticationTransfer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
