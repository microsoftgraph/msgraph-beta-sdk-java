package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The Enum to specify the Office365 ProductIds that represent the Office365 Suite SKUs.
 */
public enum OfficeProductId implements ValuedEnum {
    O365ProPlusRetail("o365ProPlusRetail"),
    O365BusinessRetail("o365BusinessRetail"),
    VisioProRetail("visioProRetail"),
    ProjectProRetail("projectProRetail");
    public final String value;
    OfficeProductId(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static OfficeProductId forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "o365ProPlusRetail": return O365ProPlusRetail;
            case "o365BusinessRetail": return O365BusinessRetail;
            case "visioProRetail": return VisioProRetail;
            case "projectProRetail": return ProjectProRetail;
            default: return null;
        }
    }
}
