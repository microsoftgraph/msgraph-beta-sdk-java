package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner possible values for states of the device&apos;s plugged-in power modes.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerBatteryPluggedMode implements ValuedEnum {
    /** Not configured; this value is ignored. */
    NotConfigured("notConfigured"),
    /** Power source is an AC charger. */
    Ac("ac"),
    /** Power source is a USB port. */
    Usb("usb"),
    /** Power source is wireless. */
    Wireless("wireless");
    public final String value;
    AndroidDeviceOwnerBatteryPluggedMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerBatteryPluggedMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "ac": return Ac;
            case "usb": return Usb;
            case "wireless": return Wireless;
            default: return null;
        }
    }
}
