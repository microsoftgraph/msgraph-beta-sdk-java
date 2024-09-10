package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Enum type used for DeviceActionCategory
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceActionCategory implements ValuedEnum {
    /** Action is performed on a single device alone */
    Single("single"),
    /** Action is performed for a set of devices */
    Bulk("bulk");
    public final String value;
    DeviceActionCategory(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceActionCategory forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "single": return Single;
            case "bulk": return Bulk;
            default: return null;
        }
    }
}
