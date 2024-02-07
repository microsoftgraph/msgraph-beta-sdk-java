package com.microsoft.graph.beta.models.ediscovery;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DataSourceContainerStatus implements ValuedEnum {
    Active("Active"),
    Released("Released"),
    UnknownFutureValue("UnknownFutureValue");
    public final String value;
    DataSourceContainerStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DataSourceContainerStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "Active": return Active;
            case "Released": return Released;
            case "UnknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
