package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IdentitySourceType implements ValuedEnum {
    AzureActiveDirectory("azureActiveDirectory"),
    External("external");
    public final String value;
    IdentitySourceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IdentitySourceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureActiveDirectory": return AzureActiveDirectory;
            case "external": return External;
            default: return null;
        }
    }
}
