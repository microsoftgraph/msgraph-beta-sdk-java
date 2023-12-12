package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported setting types
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeviceManagementConfigurationSettingUsage implements ValuedEnum {
    /** Default. No setting type specified. */
    None("none"),
    /** Configuration setting type. */
    Configuration("configuration"),
    /** Compliance setting type. */
    Compliance("compliance"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DeviceManagementConfigurationSettingUsage(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeviceManagementConfigurationSettingUsage forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "configuration": return Configuration;
            case "compliance": return Compliance;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
