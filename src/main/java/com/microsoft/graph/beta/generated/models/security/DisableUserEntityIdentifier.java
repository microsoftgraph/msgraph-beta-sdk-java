package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DisableUserEntityIdentifier implements ValuedEnum {
    AccountSid("accountSid"),
    InitiatingProcessAccountSid("initiatingProcessAccountSid"),
    RequestAccountSid("requestAccountSid"),
    OnPremSid("onPremSid"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DisableUserEntityIdentifier(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DisableUserEntityIdentifier forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "accountSid": return AccountSid;
            case "initiatingProcessAccountSid": return InitiatingProcessAccountSid;
            case "requestAccountSid": return RequestAccountSid;
            case "onPremSid": return OnPremSid;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
