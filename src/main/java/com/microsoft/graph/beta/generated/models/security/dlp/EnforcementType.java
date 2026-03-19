package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EnforcementType implements ValuedEnum {
    Unknown("unknown"),
    Combined("combined"),
    Separate("separate"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EnforcementType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EnforcementType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "combined": return Combined;
            case "separate": return Separate;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
