package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Transcript message role or recorded author kind. These are independent fields; a tool or system message can have an agent author.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum InvestigationMessageRole implements ValuedEnum {
    User("user"),
    Agent("agent"),
    System("system"),
    Tool("tool"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    InvestigationMessageRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static InvestigationMessageRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "agent": return Agent;
            case "system": return System;
            case "tool": return Tool;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
