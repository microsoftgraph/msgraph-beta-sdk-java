package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Updatescheduletypefor macOS software updates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MacOSSoftwareUpdateScheduleType implements ValuedEnum {
    /** Always update. */
    AlwaysUpdate("alwaysUpdate"),
    /** Update during time windows. */
    UpdateDuringTimeWindows("updateDuringTimeWindows"),
    /** Update outside of time windows. */
    UpdateOutsideOfTimeWindows("updateOutsideOfTimeWindows");
    public final String value;
    MacOSSoftwareUpdateScheduleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MacOSSoftwareUpdateScheduleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alwaysUpdate": return AlwaysUpdate;
            case "updateDuringTimeWindows": return UpdateDuringTimeWindows;
            case "updateOutsideOfTimeWindows": return UpdateOutsideOfTimeWindows;
            default: return null;
        }
    }
}
