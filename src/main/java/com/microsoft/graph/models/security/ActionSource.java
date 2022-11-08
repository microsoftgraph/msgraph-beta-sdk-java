package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum ActionSource implements ValuedEnum {
    Manual("manual"),
    Automatic("automatic"),
    Recommended("recommended"),
    Default_escaped("default_escaped");
    public final String value;
    ActionSource(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static ActionSource forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "manual": return Manual;
            case "automatic": return Automatic;
            case "recommended": return Recommended;
            case "default": return Default_escaped;
            default: return null;
        }
    }
}
