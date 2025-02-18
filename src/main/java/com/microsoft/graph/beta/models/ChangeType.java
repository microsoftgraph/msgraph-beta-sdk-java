package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum ChangeType implements ValuedEnum {
    Created("created"),
    Updated("updated"),
    Deleted("deleted");
    public final String value;
    ChangeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChangeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "created": return Created;
            case "updated": return Updated;
            case "deleted": return Deleted;
            default: return null;
        }
    }
}
