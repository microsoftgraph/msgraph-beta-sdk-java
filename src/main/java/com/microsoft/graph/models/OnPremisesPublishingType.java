package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OnPremisesPublishingType implements ValuedEnum {
    ApplicationProxy("applicationProxy"),
    ExchangeOnline("exchangeOnline"),
    Authentication("authentication"),
    Provisioning("provisioning"),
    IntunePfx("intunePfx"),
    OflineDomainJoin("oflineDomainJoin"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    OnPremisesPublishingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OnPremisesPublishingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "applicationProxy": return ApplicationProxy;
            case "exchangeOnline": return ExchangeOnline;
            case "authentication": return Authentication;
            case "provisioning": return Provisioning;
            case "intunePfx": return IntunePfx;
            case "oflineDomainJoin": return OflineDomainJoin;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
