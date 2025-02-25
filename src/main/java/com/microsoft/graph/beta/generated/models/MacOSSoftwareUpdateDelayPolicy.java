package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Flag enum to determine whether to delay software updates for macOS.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSSoftwareUpdateDelayPolicy implements ValuedEnum {
    /** Software update delays will not be enforced. */
    None("none"),
    /** Force delays for OS software updates. */
    DelayOSUpdateVisibility("delayOSUpdateVisibility"),
    /** Force delays for app software updates. */
    DelayAppUpdateVisibility("delayAppUpdateVisibility"),
    /** Evolvable enumeration sentinel value. Do not use. */
    UnknownFutureValue("unknownFutureValue"),
    /** Force delays for major OS software updates. */
    DelayMajorOsUpdateVisibility("delayMajorOsUpdateVisibility");
    public final String value;
    MacOSSoftwareUpdateDelayPolicy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSSoftwareUpdateDelayPolicy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "delayOSUpdateVisibility": return DelayOSUpdateVisibility;
            case "delayAppUpdateVisibility": return DelayAppUpdateVisibility;
            case "unknownFutureValue": return UnknownFutureValue;
            case "delayMajorOsUpdateVisibility": return DelayMajorOsUpdateVisibility;
            default: return null;
        }
    }
}
