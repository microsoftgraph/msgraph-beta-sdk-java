package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner possible values for states of the device's plugged-in power modes.
 */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidDeviceOwnerBatteryPluggedMode forValue(@javax.annotation.Nonnull final String searchValue) {
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
