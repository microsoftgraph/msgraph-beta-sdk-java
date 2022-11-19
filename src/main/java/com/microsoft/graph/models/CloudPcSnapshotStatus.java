package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of accessReviewDecision entities. */
public enum CloudPcSnapshotStatus implements ValuedEnum {
    Ready("ready"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcSnapshotStatus(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CloudPcSnapshotStatus forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "ready": return Ready;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
