package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Supported setting types
 */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static DeviceManagementConfigurationSettingUsage forValue(@javax.annotation.Nonnull final String searchValue) {
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
