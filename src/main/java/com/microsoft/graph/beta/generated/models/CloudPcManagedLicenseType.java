package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcManagedLicenseType implements ValuedEnum {
    Frontline("frontline"),
    Reserve("reserve"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcManagedLicenseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcManagedLicenseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "frontline": return Frontline;
            case "reserve": return Reserve;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
