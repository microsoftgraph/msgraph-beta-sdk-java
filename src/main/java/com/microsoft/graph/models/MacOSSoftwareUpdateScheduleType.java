package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static MacOSSoftwareUpdateScheduleType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alwaysUpdate": return AlwaysUpdate;
            case "updateDuringTimeWindows": return UpdateDuringTimeWindows;
            case "updateOutsideOfTimeWindows": return UpdateOutsideOfTimeWindows;
            default: return null;
        }
    }
}
