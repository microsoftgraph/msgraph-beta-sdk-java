package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DependencyType implements ValuedEnum {
    SourceFinishDrivesTargetStart("sourceFinishDrivesTargetStart"),
    SourceStartDrivesTargetStart("sourceStartDrivesTargetStart"),
    SourceFinishDrivesTargetFinish("sourceFinishDrivesTargetFinish"),
    TargetStartDrivesSourceFinish("targetStartDrivesSourceFinish"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    DependencyType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DependencyType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "sourceFinishDrivesTargetStart": return SourceFinishDrivesTargetStart;
            case "sourceStartDrivesTargetStart": return SourceStartDrivesTargetStart;
            case "sourceFinishDrivesTargetFinish": return SourceFinishDrivesTargetFinish;
            case "targetStartDrivesSourceFinish": return TargetStartDrivesSourceFinish;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
