package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum PlannerRelationshipUserRoles implements ValuedEnum {
    DefaultRules("defaultRules"),
    GroupOwners("groupOwners"),
    GroupMembers("groupMembers"),
    TaskAssignees("taskAssignees"),
    Applications("applications"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    PlannerRelationshipUserRoles(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static PlannerRelationshipUserRoles forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "defaultRules": return DefaultRules;
            case "groupOwners": return GroupOwners;
            case "groupMembers": return GroupMembers;
            case "taskAssignees": return TaskAssignees;
            case "applications": return Applications;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
