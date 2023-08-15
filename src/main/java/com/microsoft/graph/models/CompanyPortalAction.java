package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Action on a device that can be executed in the Company Portal
 */
public enum CompanyPortalAction implements ValuedEnum {
    /** Unknown device action */
    Unknown("unknown"),
    /** Remove device from Company Portal */
    Remove("remove"),
    /** Reset device enrolled in Company Portal */
    Reset("reset");
    public final String value;
    CompanyPortalAction(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CompanyPortalAction forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "remove": return Remove;
            case "reset": return Reset;
            default: return null;
        }
    }
}
