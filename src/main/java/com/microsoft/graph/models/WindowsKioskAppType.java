package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum WindowsKioskAppType implements ValuedEnum {
    /** Unknown. */
    Unknown("unknown"),
    /** Store App. */
    Store("store"),
    /** Desktop App. */
    Desktop("desktop"),
    /** Input by AUMID. */
    AumId("aumId");
    public final String value;
    WindowsKioskAppType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsKioskAppType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "store": return Store;
            case "desktop": return Desktop;
            case "aumId": return AumId;
            default: return null;
        }
    }
}
