package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcSnapshotType implements ValuedEnum {
    Automatic("automatic"),
    Manual("manual"),
    UnknownFutureValue("unknownFutureValue"),
    Retention("retention");
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
            case "retention": return Retention;
            default: return null;
        }
    }
}
