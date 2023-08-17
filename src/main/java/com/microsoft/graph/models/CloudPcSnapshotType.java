package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

public enum CloudPcSnapshotType implements ValuedEnum {
    Automatic("automatic"),
    Manual("manual"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcSnapshotType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcSnapshotType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "automatic": return Automatic;
            case "manual": return Manual;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
