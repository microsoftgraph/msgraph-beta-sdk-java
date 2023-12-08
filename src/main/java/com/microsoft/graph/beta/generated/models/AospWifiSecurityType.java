package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * This enum represents Wi-Fi Security Types for Android Device Owner AOSP Scenarios.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AospWifiSecurityType implements ValuedEnum {
    /** No security type. */
    None("none"),
    /** WPA-Pre-shared-key */
    Wpa("wpa"),
    /** WEP-Pre-shared-key */
    Wep("wep");
    public final String value;
    AospWifiSecurityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AospWifiSecurityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "wpa": return Wpa;
            case "wep": return Wep;
            default: return null;
        }
    }
}
