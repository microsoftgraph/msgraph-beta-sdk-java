package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ForwardingCategory implements ValuedEnum {
    Default("default"),
    Optimized("optimized"),
    Allow("allow"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ForwardingCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ForwardingCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "default": return Default;
            case "optimized": return Optimized;
            case "allow": return Allow;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
