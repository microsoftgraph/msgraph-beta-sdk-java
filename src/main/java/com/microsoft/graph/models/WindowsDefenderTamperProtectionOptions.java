package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Defender TamperProtection setting options
 */
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WindowsDefenderTamperProtectionOptions forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "enable": return Enable;
            case "disable": return Disable;
            default: return null;
        }
    }
}
