package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AwsSecurityToolWebServices implements ValuedEnum {
    Macie("macie"),
    WafShield("wafShield"),
    CloudTrail("cloudTrail"),
    Inspector("inspector"),
    SecurityHub("securityHub"),
    Detective("detective"),
    GuardDuty("guardDuty"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AwsSecurityToolWebServices(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AwsSecurityToolWebServices forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "macie": return Macie;
            case "wafShield": return WafShield;
            case "cloudTrail": return CloudTrail;
            case "inspector": return Inspector;
            case "securityHub": return SecurityHub;
            case "detective": return Detective;
            case "guardDuty": return GuardDuty;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
