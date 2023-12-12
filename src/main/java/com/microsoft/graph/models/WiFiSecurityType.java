package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi Security Types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WiFiSecurityType implements ValuedEnum {
    /** Open (No Authentication). */
    Open("open"),
    /** WPA-Personal. */
    WpaPersonal("wpaPersonal"),
    /** WPA-Enterprise. Must use IOSEnterpriseWifiConfiguration type to configure enterprise options. */
    WpaEnterprise("wpaEnterprise"),
    /** WEP Encryption. */
    Wep("wep"),
    /** WPA2-Personal. */
    Wpa2Personal("wpa2Personal"),
    /** WPA2-Enterprise. Must use WindowsWifiEnterpriseEAPConfiguration type to configure enterprise options. */
    Wpa2Enterprise("wpa2Enterprise");
    public final String value;
    WiFiSecurityType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WiFiSecurityType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "wpaPersonal": return WpaPersonal;
            case "wpaEnterprise": return WpaEnterprise;
            case "wep": return Wep;
            case "wpa2Personal": return Wpa2Personal;
            case "wpa2Enterprise": return Wpa2Enterprise;
            default: return null;
        }
    }
}
