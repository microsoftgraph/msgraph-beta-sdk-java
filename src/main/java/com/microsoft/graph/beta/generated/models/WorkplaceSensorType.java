package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum WorkplaceSensorType implements ValuedEnum {
    /** The occupancy sensor type. */
    Occupancy("occupancy"),
    /** The people count sensor type. */
    PeopleCount("peopleCount"),
    /** The inferred Occupancy sensor type. */
    InferredOccupancy("inferredOccupancy"),
    /** The heartbeat sensor type. */
    Heartbeat("heartbeat"),
    /** The unknown feature value. */
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    WorkplaceSensorType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static WorkplaceSensorType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "occupancy": return Occupancy;
            case "peopleCount": return PeopleCount;
            case "inferredOccupancy": return InferredOccupancy;
            case "heartbeat": return Heartbeat;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
