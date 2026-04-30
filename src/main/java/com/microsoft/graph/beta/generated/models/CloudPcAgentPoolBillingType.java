package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcAgentPoolBillingType implements ValuedEnum {
    PayAsYouGo("payAsYouGo"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcAgentPoolBillingType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcAgentPoolBillingType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "payAsYouGo": return PayAsYouGo;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
