package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ProvisionState implements ValuedEnum {
    NotProvisioned("notProvisioned"),
    ProvisioningInProgress("provisioningInProgress"),
    ProvisioningFailed("provisioningFailed"),
    ProvisioningCompleted("provisioningCompleted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ProvisionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ProvisionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notProvisioned": return NotProvisioned;
            case "provisioningInProgress": return ProvisioningInProgress;
            case "provisioningFailed": return ProvisioningFailed;
            case "provisioningCompleted": return ProvisioningCompleted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
