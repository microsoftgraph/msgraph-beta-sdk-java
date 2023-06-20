package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum MicrosoftAuthenticatorAuthenticationMethodClientAppName implements ValuedEnum {
    MicrosoftAuthenticator("microsoftAuthenticator"),
    OutlookMobile("outlookMobile"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MicrosoftAuthenticatorAuthenticationMethodClientAppName(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MicrosoftAuthenticatorAuthenticationMethodClientAppName forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftAuthenticator": return MicrosoftAuthenticator;
            case "outlookMobile": return OutlookMobile;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
