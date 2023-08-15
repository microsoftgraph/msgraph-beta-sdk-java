package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum SensitiveTypeSource implements ValuedEnum {
    OutOfBox("outOfBox"),
    Tenant("tenant");
    public final String value;
    SensitiveTypeSource(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static SensitiveTypeSource forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "outOfBox": return OutOfBox;
            case "tenant": return Tenant;
            default: return null;
        }
    }
}
