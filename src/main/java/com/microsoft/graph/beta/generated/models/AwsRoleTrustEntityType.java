package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AwsRoleTrustEntityType implements ValuedEnum {
    None("none"),
    Service("service"),
    Sso("sso"),
    CrossAccount("crossAccount"),
    WebIdentity("webIdentity"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AwsRoleTrustEntityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AwsRoleTrustEntityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "service": return Service;
            case "sso": return Sso;
            case "crossAccount": return CrossAccount;
            case "webIdentity": return WebIdentity;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
