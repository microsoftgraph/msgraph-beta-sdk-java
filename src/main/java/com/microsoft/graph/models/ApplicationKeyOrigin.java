package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ApplicationKeyOrigin implements ValuedEnum {
    Application("application"),
    ServicePrincipal("servicePrincipal"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ApplicationKeyOrigin(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ApplicationKeyOrigin forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "application": return Application;
            case "servicePrincipal": return ServicePrincipal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
