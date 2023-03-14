package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcUserAccessLevel implements ValuedEnum {
    Unrestricted("unrestricted"),
    Restricted("restricted"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcUserAccessLevel(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcUserAccessLevel forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unrestricted": return Unrestricted;
            case "restricted": return Restricted;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
