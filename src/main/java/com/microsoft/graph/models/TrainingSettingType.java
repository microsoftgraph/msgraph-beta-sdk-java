package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum TrainingSettingType implements ValuedEnum {
    MicrosoftCustom("microsoftCustom"),
    MicrosoftManaged("microsoftManaged"),
    NoTraining("noTraining"),
    Custom("custom"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    TrainingSettingType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static TrainingSettingType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "microsoftCustom": return MicrosoftCustom;
            case "microsoftManaged": return MicrosoftManaged;
            case "noTraining": return NoTraining;
            case "custom": return Custom;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
