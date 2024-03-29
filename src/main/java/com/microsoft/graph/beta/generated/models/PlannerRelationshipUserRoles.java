package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
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
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static PlannerRelationshipUserRoles forValue(@jakarta.annotation.Nonnull final String searchValue) {
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
