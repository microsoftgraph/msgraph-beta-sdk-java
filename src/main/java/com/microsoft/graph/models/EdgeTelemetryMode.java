package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Type of browsing data sent to Microsoft 365 analytics
 */
public enum EdgeTelemetryMode implements ValuedEnum {
    /** Default  No telemetry data collected or sent */
    NotConfigured("notConfigured"),
    /** Allow sending intranet history only: Only send browsing history data for intranet sites */
    Intranet("intranet"),
    /** Allow sending internet history only: Only send browsing history data for internet sites */
    Internet("internet"),
    /** Allow sending both intranet and internet history: Send browsing history data for intranet and internet sites */
    IntranetAndInternet("intranetAndInternet");
    public final String value;
    EdgeTelemetryMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EdgeTelemetryMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "intranet": return Intranet;
            case "internet": return Internet;
            case "intranetAndInternet": return IntranetAndInternet;
            default: return null;
        }
    }
}
