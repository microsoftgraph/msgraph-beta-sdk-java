package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum KioskModeType implements ValuedEnum {
    /** Not configured */
    NotConfigured("notConfigured"),
    /** Run in single-app mode */
    SingleAppMode("singleAppMode"),
    /** Run in multi-app mode */
    MultiAppMode("multiAppMode");
    public final String value;
    KioskModeType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static KioskModeType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "singleAppMode": return SingleAppMode;
            case "multiAppMode": return MultiAppMode;
            default: return null;
        }
    }
}
