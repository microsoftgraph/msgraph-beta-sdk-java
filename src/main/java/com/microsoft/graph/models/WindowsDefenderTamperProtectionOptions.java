package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum WindowsDefenderTamperProtectionOptions implements ValuedEnum {
    /** Not Configured */
    NotConfigured("notConfigured"),
    /** Enable windows defender tamper protection */
    Enable("enable"),
    /** Disable windows defender tamper protection */
    Disable("disable");
    public final String value;
    WindowsDefenderTamperProtectionOptions(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static WindowsDefenderTamperProtectionOptions forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enable": return Enable;
            case "disable": return Disable;
            default: return null;
        }
    }
}
