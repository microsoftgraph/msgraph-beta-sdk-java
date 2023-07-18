package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ForwardingCategory implements ValuedEnum {
    Default("default"),
    Optimized("optimized"),
    Allow("allow"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ForwardingCategory(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ForwardingCategory forValue(@javax.annotation.Nonnull final String searchValue) {
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
