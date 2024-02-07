package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Wi-Fi Proxy Settings.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WiFiProxySetting implements ValuedEnum {
    /** No Proxy. */
    None("none"),
    /** Manual Proxy Settings via Address and Port. */
    Manual("manual"),
    /** Automatic Proxy Settings via URL. */
    Automatic("automatic"),
    /** Unknown future value for evolvable enum patterns. */
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
