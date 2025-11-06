package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcImageOsArchitectureType implements ValuedEnum {
    X64("x64"),
    Arm64("arm64"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcImageOsArchitectureType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcImageOsArchitectureType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "x64": return X64;
            case "arm64": return Arm64;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
