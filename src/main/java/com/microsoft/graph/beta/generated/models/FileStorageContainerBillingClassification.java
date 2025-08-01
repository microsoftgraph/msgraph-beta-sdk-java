package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FileStorageContainerBillingClassification implements ValuedEnum {
    Standard("standard"),
    Trial("trial"),
    DirectToCustomer("directToCustomer"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    FileStorageContainerBillingClassification(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FileStorageContainerBillingClassification forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "trial": return Trial;
            case "directToCustomer": return DirectToCustomer;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
