package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcDisasterRecoveryLicenseType implements ValuedEnum {
    None("none"),
    Standard("standard"),
    UnknownFutureValue("unknownFutureValue"),
    Plus("plus");
    public final String value;
    CloudPcDisasterRecoveryLicenseType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcDisasterRecoveryLicenseType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "standard": return Standard;
            case "unknownFutureValue": return UnknownFutureValue;
            case "plus": return Plus;
            default: return null;
        }
    }
}
