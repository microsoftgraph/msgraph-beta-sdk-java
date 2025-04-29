package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerContainerType implements ValuedEnum {
    Group("group"),
    UnknownFutureValue("unknownFutureValue"),
    Roster("roster"),
    Project("project"),
    DriveItem("driveItem"),
    User("user"),
    TeamsChannel("teamsChannel"),
    PlannerTask("plannerTask");
    public final String value;
    PlannerContainerType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerContainerType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "group": return Group;
            case "unknownFutureValue": return UnknownFutureValue;
            case "roster": return Roster;
            case "project": return Project;
            case "driveItem": return DriveItem;
            case "user": return User;
            case "teamsChannel": return TeamsChannel;
            case "plannerTask": return PlannerTask;
            default: return null;
        }
    }
}
