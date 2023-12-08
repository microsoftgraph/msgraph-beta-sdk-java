package com.microsoft.graph.beta.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum UsageStatus implements ValuedEnum {
    FrequentlyUsed("frequentlyUsed"),
    RarelyUsed("rarelyUsed"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    UsageStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static UsageStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "frequentlyUsed": return FrequentlyUsed;
            case "rarelyUsed": return RarelyUsed;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
