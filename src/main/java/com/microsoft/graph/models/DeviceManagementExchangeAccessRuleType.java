package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Criteria which defines the type of device this access rule will apply to
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementExchangeAccessRuleType implements ValuedEnum {
    /** Family of devices */
    Family("family"),
    /** Specific model of device */
    Model("model");
    public final String value;
    DeviceManagementExchangeAccessRuleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementExchangeAccessRuleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "family": return Family;
            case "model": return Model;
            default: return null;
        }
    }
}
