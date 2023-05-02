package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum IdentitySourceType implements ValuedEnum {
    AzureActiveDirectory("azureActiveDirectory"),
    External("external");
    public final String value;
    IdentitySourceType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IdentitySourceType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "azureActiveDirectory": return AzureActiveDirectory;
            case "external": return External;
            default: return null;
        }
    }
}
