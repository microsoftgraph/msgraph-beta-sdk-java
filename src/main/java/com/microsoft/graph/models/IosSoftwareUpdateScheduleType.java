package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
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
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static IosSoftwareUpdateScheduleType forValue(@javax.annotation.Nonnull final String searchValue) {
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
