package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum SensitiveTypeSource implements ValuedEnum {
    OutOfBox("outOfBox"),
    Tenant("tenant");
    public final String value;
    SensitiveTypeSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static SensitiveTypeSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "outOfBox": return OutOfBox;
            case "tenant": return Tenant;
            default: return null;
        }
    }
}
