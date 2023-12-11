package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Android Device Owner Location Mode Type
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AndroidDeviceOwnerLocationMode implements ValuedEnum {
    /** No restrictions on the location setting and no specific behavior is set or enforced. This is the default */
    NotConfigured("notConfigured"),
    /** Location setting is disabled on the device */
    Disabled("disabled"),
    /** Evolvable enumeration sentinel value. Do not use */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidDeviceOwnerLocationMode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AndroidDeviceOwnerLocationMode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notConfigured": return NotConfigured;
            case "disabled": return Disabled;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
