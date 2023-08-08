package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ForceUserPasswordResetEntityIdentifier implements ValuedEnum {
    AccountSid("accountSid"),
    InitiatingProcessAccountSid("initiatingProcessAccountSid"),
    RequestAccountSid("requestAccountSid"),
    OnPremSid("onPremSid"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ForceUserPasswordResetEntityIdentifier(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ForceUserPasswordResetEntityIdentifier forValue(@javax.annotation.Nonnull final String searchValue) {
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
