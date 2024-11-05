package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The possible security types for Android Wi-Fi profiles. Default value 'Open', indicates no authentication required for the network. The security protocols supported are WEP, WPA and WPA2. 'WpaEnterprise' and 'Wpa2Enterprise' options are available for Enterprise Wi-Fi profiles. 'Wep' and 'WpaPersonal' (supports WPA and WPA2) options are available for Basic Wi-Fi profiles.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidWiFiSecurityType implements ValuedEnum {
    /** Default. Indicates Android Wifi Security Type is set to "Open" i.e. no authentication is required. (No Authentication). */
    Open("open"),
    /** Indicates Android Wifi Security Type is set to WPA encryption. Must use AndroidWorkProfileEnterpriseWifiConfiguration type to configure enterprise options. */
    WpaEnterprise("wpaEnterprise"),
    /** Indicates Android Wifi Security Type is set to WPA2 encryption. Must use AndroidWorkProfileEnterpriseWifiConfiguration type to configure enterprise options. */
    Wpa2Enterprise("wpa2Enterprise"),
    /** Indicates Android Wifi Security Type is set to WEP encryption. This restricts the preSharedKey to a valid passphrase (5 or 13 characters) or a valid HEX key (10 or 26 hexidecimal characters). Use AndroidWorkProfileWifiConfiguration to configure basic Wi-Fi options. */
    Wep("wep"),
    /**  Indicates Android Wifi Security Type is set to WPA encryption. This restricts the preSharedKey to a string between 8 and 64 characters long. Use AndroidWorkProfileWifiConfiguration to configure basic Wi-Fi options. */
    WpaPersonal("wpaPersonal"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
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
            case "wep": return Wep;
            case "wpaPersonal": return WpaPersonal;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
