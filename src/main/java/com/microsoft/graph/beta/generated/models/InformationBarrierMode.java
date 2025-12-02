package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InformationBarrierMode implements ValuedEnum {
    Open("open"),
    OwnerModerated("ownerModerated"),
    Explicit("explicit"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InformationBarrierMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InformationBarrierMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "ownerModerated": return OwnerModerated;
            case "explicit": return Explicit;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
