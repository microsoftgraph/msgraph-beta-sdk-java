package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Updatescheduletypefor iOS software updates.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum IosSoftwareUpdateScheduleType implements ValuedEnum {
    /** Update outside of active hours. */
    UpdateOutsideOfActiveHours("updateOutsideOfActiveHours"),
    /** Always update. */
    AlwaysUpdate("alwaysUpdate"),
    /** Update during time windows. */
    UpdateDuringTimeWindows("updateDuringTimeWindows"),
    /** Update outside of time windows. */
    UpdateOutsideOfTimeWindows("updateOutsideOfTimeWindows");
    public final String value;
    IosSoftwareUpdateScheduleType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static IosSoftwareUpdateScheduleType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "updateOutsideOfActiveHours": return UpdateOutsideOfActiveHours;
            case "alwaysUpdate": return AlwaysUpdate;
            case "updateDuringTimeWindows": return UpdateDuringTimeWindows;
            case "updateOutsideOfTimeWindows": return UpdateOutsideOfTimeWindows;
            default: return null;
        }
    }
}
