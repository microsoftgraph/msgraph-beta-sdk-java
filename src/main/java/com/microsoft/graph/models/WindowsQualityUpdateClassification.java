package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Windows quality update classification */
public enum WindowsQualityUpdateClassification implements ValuedEnum {
    /** All update type */
    All("all"),
    /** Security only update type */
    Security("security"),
    /** Non security only update type */
    NonSecurity("nonSecurity");
    public final String value;
    WindowsQualityUpdateClassification(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsQualityUpdateClassification forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "security": return Security;
            case "nonSecurity": return NonSecurity;
            default: return null;
        }
    }
}
