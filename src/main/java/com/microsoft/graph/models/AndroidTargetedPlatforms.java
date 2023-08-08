package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies which platform(s) can be targeted for a given Android LOB application or Managed Android LOB application.
 */
public enum AndroidTargetedPlatforms implements ValuedEnum {
    /** Indicates the Android targeted platform is Android Device Administrator. */
    AndroidDeviceAdministrator("androidDeviceAdministrator"),
    /** Indicates the Android targeted platform is Android Open Source Project. */
    AndroidOpenSourceProject("androidOpenSourceProject"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    AndroidTargetedPlatforms(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static AndroidTargetedPlatforms forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "androidDeviceAdministrator": return AndroidDeviceAdministrator;
            case "androidOpenSourceProject": return AndroidOpenSourceProject;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
