package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows quality update category
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WindowsQualityUpdateCategory implements ValuedEnum {
    /** All update type */
    All("all"),
    /** Security only update type */
    Security("security"),
    /** Non security only update type */
    NonSecurity("nonSecurity");
    public final String value;
    WindowsQualityUpdateCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsQualityUpdateCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "all": return All;
            case "security": return Security;
            case "nonSecurity": return NonSecurity;
            default: return null;
        }
    }
}
