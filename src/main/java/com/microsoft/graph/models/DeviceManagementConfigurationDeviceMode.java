package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Describes applicability for the mode the device is in
 */
public enum DeviceManagementConfigurationDeviceMode implements ValuedEnum {
    /** No Device Mode specified */
    None("none"),
    /** Device must be in kiosk mode for this setting to apply */
    Kiosk("kiosk");
    public final String value;
    DeviceManagementConfigurationDeviceMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationDeviceMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "kiosk": return Kiosk;
            default: return null;
        }
    }
}
