package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Represents the expected type for a macOS custom attribute script value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceCustomAttributeValueType implements ValuedEnum {
    /** Indicates the value for a custom attribute script is an integer. */
    Integer("integer"),
    /** Indicates the value for a custom attribute script is a string. */
    String("string"),
    /** Indicates the value for a custom attribute script is a date conforming to ISO 8601. */
    DateTime("dateTime");
    public final String value;
    DeviceCustomAttributeValueType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceCustomAttributeValueType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "integer": return Integer;
            case "string": return String;
            case "dateTime": return DateTime;
            default: return null;
        }
    }
}
