package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi Security Types.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WiFiSecurityType implements ValuedEnum {
    /** Default. Indicates Wi-Fi security type is associated with Open (No Authentication). */
    Open("open"),
    /** Indicates Wi-Fi security type is associated with WPA-Personal. */
    WpaPersonal("wpaPersonal"),
    /** Indicates Wi-Fi security type is associated with WPA-Enterprise. Must use IOSEnterpriseWifiConfiguration type to configure enterprise options. */
    WpaEnterprise("wpaEnterprise"),
    /** Indicates Wi-Fi security type is associated with WEP Encryption. */
    Wep("wep"),
    /** Indicates Wi-Fi security type is associated with WPA2-Personal. */
    Wpa2Personal("wpa2Personal"),
    /** Indicates Wi-Fi security type is associated with WPA2-Enterprise. Must use WindowsWifiEnterpriseEAPConfiguration type to configure enterprise options. */
    Wpa2Enterprise("wpa2Enterprise"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Indicates Wi-Fi security type is associated with WPA3-Personal. Provides stronger encryption using Simultaneous Authentication of Equals (SAE). */
    Wpa3Personal("wpa3Personal");
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
            case "unknownFutureValue": return UnknownFutureValue;
            case "wpa3Personal": return Wpa3Personal;
            default: return null;
        }
    }
}
