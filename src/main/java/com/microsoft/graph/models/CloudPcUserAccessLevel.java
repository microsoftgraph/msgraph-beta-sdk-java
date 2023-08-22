package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcUserAccessLevel implements ValuedEnum {
    Unrestricted("unrestricted"),
    Restricted("restricted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcUserAccessLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcUserAccessLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unrestricted": return Unrestricted;
            case "restricted": return Restricted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
