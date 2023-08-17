package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi Security Types for Android.
 */
public enum AndroidWiFiSecurityType implements ValuedEnum {
    /** Open (No Authentication). */
    Open("open"),
    /** WPA-Enterprise. Must use AndroidEnterpriseWifiConfiguration type to configure enterprise options. */
    WpaEnterprise("wpaEnterprise"),
    /** WPA2-Enterprise. Must use AndroidEnterpriseWifiConfiguration type to configure enterprise options. */
    Wpa2Enterprise("wpa2Enterprise");
    public final String value;
    AndroidWiFiSecurityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidWiFiSecurityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "wpaEnterprise": return WpaEnterprise;
            case "wpa2Enterprise": return Wpa2Enterprise;
            default: return null;
        }
    }
}
