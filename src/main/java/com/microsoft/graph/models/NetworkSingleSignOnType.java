package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi Network Single Sign On Type Settings.
 */
public enum NetworkSingleSignOnType implements ValuedEnum {
    /** Disabled */
    Disabled("disabled"),
    /** Pre-Logon */
    Prelogon("prelogon"),
    /** Post-Logon */
    Postlogon("postlogon");
    public final String value;
    NetworkSingleSignOnType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static NetworkSingleSignOnType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "disabled": return Disabled;
            case "prelogon": return Prelogon;
            case "postlogon": return Postlogon;
            default: return null;
        }
    }
}
