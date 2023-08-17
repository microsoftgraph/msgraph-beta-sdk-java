package com.microsoft.graph.models.ediscovery;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChildSelectability implements ValuedEnum {
    One("One"),
    Many("Many");
    public final String value;
    ChildSelectability(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChildSelectability forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "One": return One;
            case "Many": return Many;
            default: return null;
        }
    }
}
