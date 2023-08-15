package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ActionState implements ValuedEnum {
    None("none"),
    Pending("pending"),
    Canceled("canceled"),
    Active("active"),
    Done("done"),
    Failed("failed"),
    NotSupported("notSupported");
    public final String value;
    ActionState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ActionState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "none": return None;
            case "pending": return Pending;
            case "canceled": return Canceled;
            case "active": return Active;
            case "done": return Done;
            case "failed": return Failed;
            case "notSupported": return NotSupported;
            default: return null;
        }
    }
}
