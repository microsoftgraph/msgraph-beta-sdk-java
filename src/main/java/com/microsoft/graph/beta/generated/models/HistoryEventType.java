package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum HistoryEventType implements ValuedEnum {
    Created("created"),
    Updated("updated"),
    Deleted("deleted"),
    Undeleted("undeleted"),
    Moved("moved"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    HistoryEventType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static HistoryEventType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "created": return Created;
            case "updated": return Updated;
            case "deleted": return Deleted;
            case "undeleted": return Undeleted;
            case "moved": return Moved;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
