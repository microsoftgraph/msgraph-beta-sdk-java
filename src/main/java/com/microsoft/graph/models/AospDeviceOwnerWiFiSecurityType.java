package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReview entities. */
public enum AospDeviceOwnerWiFiSecurityType implements ValuedEnum {
    /** Open (No Authentication). */
    Open("open"),
    /** WEP Encryption. */
    Wep("wep"),
    /** WPA-Personal/WPA2-Personal. */
    WpaPersonal("wpaPersonal"),
    /** WPA-Enterprise/WPA2-Enterprise. Must use AOSPDeviceOwnerEnterpriseWifiConfiguration type to configure enterprise options. */
    WpaEnterprise("wpaEnterprise");
    public final String value;
    AospDeviceOwnerWiFiSecurityType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AospDeviceOwnerWiFiSecurityType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "open": return Open;
            case "wep": return Wep;
            case "wpaPersonal": return WpaPersonal;
            case "wpaEnterprise": return WpaEnterprise;
            default: return null;
        }
    }
}
