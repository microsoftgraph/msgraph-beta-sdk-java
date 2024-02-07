package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AuthenticationAppPolicyStatus implements ValuedEnum {
    Unknown("unknown"),
    AppLockOutOfDate("appLockOutOfDate"),
    AppLockEnabled("appLockEnabled"),
    AppLockDisabled("appLockDisabled"),
    AppContextOutOfDate("appContextOutOfDate"),
    AppContextShown("appContextShown"),
    AppContextNotShown("appContextNotShown"),
    LocationContextOutOfDate("locationContextOutOfDate"),
    LocationContextShown("locationContextShown"),
    LocationContextNotShown("locationContextNotShown"),
    NumberMatchOutOfDate("numberMatchOutOfDate"),
    NumberMatchCorrectNumberEntered("numberMatchCorrectNumberEntered"),
    NumberMatchIncorrectNumberEntered("numberMatchIncorrectNumberEntered"),
    NumberMatchDeny("numberMatchDeny"),
    TamperResistantHardwareOutOfDate("tamperResistantHardwareOutOfDate"),
    TamperResistantHardwareUsed("tamperResistantHardwareUsed"),
    TamperResistantHardwareNotUsed("tamperResistantHardwareNotUsed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AuthenticationAppPolicyStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AuthenticationAppPolicyStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "appLockOutOfDate": return AppLockOutOfDate;
            case "appLockEnabled": return AppLockEnabled;
            case "appLockDisabled": return AppLockDisabled;
            case "appContextOutOfDate": return AppContextOutOfDate;
            case "appContextShown": return AppContextShown;
            case "appContextNotShown": return AppContextNotShown;
            case "locationContextOutOfDate": return LocationContextOutOfDate;
            case "locationContextShown": return LocationContextShown;
            case "locationContextNotShown": return LocationContextNotShown;
            case "numberMatchOutOfDate": return NumberMatchOutOfDate;
            case "numberMatchCorrectNumberEntered": return NumberMatchCorrectNumberEntered;
            case "numberMatchIncorrectNumberEntered": return NumberMatchIncorrectNumberEntered;
            case "numberMatchDeny": return NumberMatchDeny;
            case "tamperResistantHardwareOutOfDate": return TamperResistantHardwareOutOfDate;
            case "tamperResistantHardwareUsed": return TamperResistantHardwareUsed;
            case "tamperResistantHardwareNotUsed": return TamperResistantHardwareNotUsed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
