package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum EndUserNotificationType implements ValuedEnum {
    Unknown("unknown"),
    PositiveReinforcement("positiveReinforcement"),
    NoTraining("noTraining"),
    TrainingAssignment("trainingAssignment"),
    TrainingReminder("trainingReminder"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    EndUserNotificationType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static EndUserNotificationType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "positiveReinforcement": return PositiveReinforcement;
            case "noTraining": return NoTraining;
            case "trainingAssignment": return TrainingAssignment;
            case "trainingReminder": return TrainingReminder;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
