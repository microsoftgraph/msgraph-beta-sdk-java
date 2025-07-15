package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Indicates the supported device type for an apple setting.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationAppleApplicabilityDeviceType implements ValuedEnum {
    /** No applicability */
    None("none"),
    /** Applies to iOS devices */
    Ios("ios"),
    /** Applies to Shared iPad devices. */
    SharediPad("sharediPad"),
    /** Applies to macOS devices */
    MacOS("macOS"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationAppleApplicabilityDeviceType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationAppleApplicabilityDeviceType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "ios": return Ios;
            case "sharediPad": return SharediPad;
            case "macOS": return MacOS;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
