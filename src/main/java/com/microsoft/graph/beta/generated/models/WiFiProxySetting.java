package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi Proxy Settings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WiFiProxySetting implements ValuedEnum {
    /** Default. Indicates Wi-Fi Proxy is not set. */
    None("none"),
    /** Indicates Wi-Fi Proxy is set by manually specifying an address and port as well as an optional list of hostnames that are exculded. This value is not supported for AndroidWorkProfileWiFiConfigurations. */
    Manual("manual"),
    /** Indicates Wi-Fi Proxy is set automatically by providing the URL to a PAC (Proxy Auto Configuration) file which contains a list of proxy servers to use. */
    Automatic("automatic"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WiFiProxySetting(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WiFiProxySetting forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "manual": return Manual;
            case "automatic": return Automatic;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
