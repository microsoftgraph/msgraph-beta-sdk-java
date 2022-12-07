package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of activityStatistics entities. */
public enum GroupPolicyDefinitionClassType implements ValuedEnum {
    /** Identifies placement of the policy setting under the user configuration node. */
    User("user"),
    /** Identifies placement of the policy setting under the computer configuration node. */
    Machine("machine");
    public final String value;
    GroupPolicyDefinitionClassType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static GroupPolicyDefinitionClassType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "machine": return Machine;
            default: return null;
        }
    }
}
