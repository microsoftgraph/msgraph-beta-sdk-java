package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents various network types for Zebra FOTA deployment.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ZebraFotaNetworkType implements ValuedEnum {
    /** The device will install the update regardless of current network type. */
    Any("any"),
    /** The device will install the update only when connected to WiFi network. */
    Wifi("wifi"),
    /** The device will install the update only when connected a Cellular network. */
    Cellular("cellular"),
    /** The device will install the update when connected both WiFi and Cellular. */
    WifiAndCellular("wifiAndCellular"),
    /** Unknown future enum value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    ZebraFotaNetworkType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ZebraFotaNetworkType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "any": return Any;
            case "wifi": return Wifi;
            case "cellular": return Cellular;
            case "wifiAndCellular": return WifiAndCellular;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
