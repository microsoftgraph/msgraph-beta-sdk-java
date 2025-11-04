package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CloudPcImportedSnapshotState implements ValuedEnum {
    NotUsed("notUsed"),
    InUse("inUse"),
    Expired("expired"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CloudPcImportedSnapshotState(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CloudPcImportedSnapshotState forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "notUsed": return NotUsed;
            case "inUse": return InUse;
            case "expired": return Expired;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
