package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Possible values of xbox service start type
 */
public enum ServiceStartType implements ValuedEnum {
    /** Manual service start type(default) */
    Manual("manual"),
    /** Automatic service start type */
    Automatic("automatic"),
    /** Service start type disabled */
    Disabled("disabled");
    public final String value;
    ServiceStartType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ServiceStartType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automatic": return Automatic;
            case "disabled": return Disabled;
            default: return null;
        }
    }
}
