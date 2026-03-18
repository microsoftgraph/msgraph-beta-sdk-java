package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcExternalPartnerAuthenticatedMethod implements ValuedEnum {
    GDAP("gDAP"),
    DAP("dAP"),
    AppOnly("appOnly"),
    NormalUser("normalUser"),
    GuestUser("guestUser"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcExternalPartnerAuthenticatedMethod(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcExternalPartnerAuthenticatedMethod forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "gDAP": return GDAP;
            case "dAP": return DAP;
            case "appOnly": return AppOnly;
            case "normalUser": return NormalUser;
            case "guestUser": return GuestUser;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
