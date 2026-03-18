package com.microsoft.graph.beta.models.security.dlp;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PurposeType implements ValuedEnum {
    Audit("audit"),
    Di("di"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PurposeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PurposeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "audit": return Audit;
            case "di": return Di;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
