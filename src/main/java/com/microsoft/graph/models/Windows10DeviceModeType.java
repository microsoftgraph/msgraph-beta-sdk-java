package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Windows 10 Device Mode type.
 */
public enum Windows10DeviceModeType implements ValuedEnum {
    /** Standard Configuration */
    StandardConfiguration("standardConfiguration"),
    /** S Mode Configuration */
    SModeConfiguration("sModeConfiguration");
    public final String value;
    Windows10DeviceModeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Windows10DeviceModeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standardConfiguration": return StandardConfiguration;
            case "sModeConfiguration": return SModeConfiguration;
            default: return null;
        }
    }
}
