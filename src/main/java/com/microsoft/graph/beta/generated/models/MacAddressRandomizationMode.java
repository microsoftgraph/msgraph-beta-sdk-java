package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * An enum representing the possible values of Android MAC Address Randomization Mode.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacAddressRandomizationMode implements ValuedEnum {
    /** Indicates the Wi-Fi framework to automatically decide the MAC randomization strategy. This can either be persistent or non-persistent randomly generated MAC addresses which are used while connecting to the network. In case of Persistent randomization, android generates a persistent randomized MAC address based on the parameters of the network profile. This MAC address remains the same until factory reset. On the other hand under the non-persistent randomization type, which is used for some networks in Android 12 or higher, the Wi-Fi module re-randomizes the MAC address at the start of every connection or the framework uses the existing randomized MAC address to connect to the network. More info: https://source.android.com/docs/core/connect/wifi-mac-randomization-behavior#types */
    Automatic("automatic"),
    /** Indicates MAC randomization is disabled and the factory MAC address is used when connecting to the internet. */
    Hardware("hardware"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    MacAddressRandomizationMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacAddressRandomizationMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "automatic": return Automatic;
            case "hardware": return Hardware;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
