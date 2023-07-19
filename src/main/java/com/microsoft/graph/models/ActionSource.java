package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ActionSource implements ValuedEnum {
    Manual("manual"),
    Automatic("automatic"),
    Recommended("recommended"),
    Default("default");
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
            case "default": return Default;
            default: return null;
        }
    }
}
