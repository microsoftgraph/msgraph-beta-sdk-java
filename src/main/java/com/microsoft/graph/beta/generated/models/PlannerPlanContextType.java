package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum PlannerPlanContextType implements ValuedEnum {
    TeamsTab("teamsTab"),
    SharePointPage("sharePointPage"),
    MeetingNotes("meetingNotes"),
    Other("other"),
    UnknownFutureValue("unknownFutureValue"),
    LoopPage("loopPage"),
    Project("project");
    public final String value;
    PlannerPlanContextType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerPlanContextType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "teamsTab": return TeamsTab;
            case "sharePointPage": return SharePointPage;
            case "meetingNotes": return MeetingNotes;
            case "other": return Other;
            case "unknownFutureValue": return UnknownFutureValue;
            case "loopPage": return LoopPage;
            case "project": return Project;
            default: return null;
        }
    }
}
